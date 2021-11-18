package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.animals.AnimalResponse;
import AdopcionAnimales.api.utils.PaginationInfo;

import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.api.publications.PublicationPaginatedResponse;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import AdopcionAnimales.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.decode;

@Service
public class PublicationServiceImpl implements PublicationService{

    private PublicationMapper publicationMapper;
    private UsersRepository usersRepository;
    private PublicationRepository publicationRepository;

    @Autowired
    public PublicationServiceImpl(UsersRepository usersRepository, PublicationRepository publicationRepository, PublicationMapper publicationMapper) {
        super();
        this.usersRepository = usersRepository;
        this.publicationRepository = publicationRepository;
        this.publicationMapper = publicationMapper;
    }

    @Override
    @Transactional
    public void addPublication(PublicationCreationRequest publicationCreationRequest) throws IOException {
        String base64 = publicationCreationRequest.getImage();
        publicationCreationRequest.setImage("");


        Publication newPublication = publicationMapper.publicationCreationRequestToPublication(publicationCreationRequest);
        User user = getUser();
        newPublication.setUser(user);
        user.getPublications().add(publicationRepository.save(newPublication));

        String idPublication = newPublication.getId().toString();
        String fileName = "";
        if(base64.length() <= 0){
            fileName = "img\\nophoto.png";

        }else
        {
            fileName = "img\\" + idPublication + ".png";
            try(FileOutputStream stream = new FileOutputStream(fileName)) {
                stream.write(decode(base64));
            }
        }

        newPublication.setImage(fileName);

        publicationRepository.save(newPublication);
        usersRepository.save(user);
    }
    private static byte[] decode(String base64String){
        return Base64.getDecoder().decode(base64String);
    }

    private static String encode(String imagePath) throws IOException{
        byte[] data = Files.readAllBytes(Paths.get(imagePath));
        return Base64.getEncoder().encodeToString(data);
    }

    @Override
    @Transactional
    public void deletePublication(Long idPublication) throws IllegalArgumentException {
        Publication publication = findPublicationById(idPublication);

        User user = getUser();
        user.getPublications().remove(publication);

        usersRepository.save(user);
        publicationRepository.delete(publication);
    }

    @Override
    public void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, Long idPublication) {
        Publication publication = findPublicationById(idPublication);
        publication.setPublicationDate(publicationDateChangeRequest.getNewPublicationDate());

        publicationRepository.save(publication);
    }

    private User getUser() {
        User user = usersRepository.findUserByUsername(SecurityUtils.currentUserUsername());
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }

    @Override
    @Transactional
    public Publication findPublicationById(Long id) {
        return publicationRepository.findById(id).orElse(null);
    }

    @Override
    public PublicationPaginatedResponse getPublications(Integer page, Integer size) throws IOException {
        Page<Publication> matchedPublications = publicationRepository.getPublications(PageRequest.of(page, size));
        return getPublicationPaginatedResponse(matchedPublications);
    }

    @Override
    public PublicationPaginatedResponse getPublicationsFromUser(String username, Integer page, Integer size) throws IOException {
        Page<Publication> matchedPublications = publicationRepository.getPublicationsFromUser(username, PageRequest.of(page, size));
        return getPublicationPaginatedResponse(matchedPublications);
    }

    private PublicationPaginatedResponse getPublicationPaginatedResponse(Page<Publication> matchedPublications) throws IOException {
        List<Publication> publications = matchedPublications.stream().collect(Collectors.toList());
        List<PublicationResponse> publicationResponses = publicationMapper.publicationToPublicationResponse(publications);
        for(int i = 0; i < publicationResponses.size(); i++)
        {
            String image = publicationResponses.get(i).getImage();
            String base64 = encode(image);
            publicationResponses.get(i).setImage(base64);
        }

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedPublications.getNumberOfElements());
        paginationInfo.setTotalPages(matchedPublications.getTotalPages());

        PublicationPaginatedResponse paginatedResponse = new PublicationPaginatedResponse();
        paginatedResponse.setPages(publicationResponses);
        paginatedResponse.setPaginationInfo(paginationInfo);

        return paginatedResponse;
    }

}
