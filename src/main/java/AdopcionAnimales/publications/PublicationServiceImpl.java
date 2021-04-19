package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.PaginationInfo;
import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
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
import java.util.List;
import java.util.stream.Collectors;

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
    public void addPublication(PublicationCreationRequest publicationCreationRequest) {
        Publication newPublication = publicationMapper.publicationCreationRequestToPublication(publicationCreationRequest);
        User user = getUser();
        user.getPublications().add(publicationRepository.save(newPublication));

        usersRepository.save(user);
        publicationRepository.save(newPublication);
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
    @Transactional
    public PublicationPaginatedResponse obtainUserPublications(String username, Integer page, Integer size) {
        Page<Publication> matchedPublication = publicationRepository.searchUserPublication(
                usersRepository.findUserByUsernameWithPublications(username).getIdUser(), PageRequest.of(page, size));
        List<PublicationResponse> publicationResponses = matchedPublication.map(publication -> publicationMapper.publicationToPublicationResponse(publication)).stream()
                .collect(Collectors.toList());

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedPublication.getNumberOfElements());
        paginationInfo.setTotalPages(matchedPublication.getTotalPages());

        PublicationPaginatedResponse publicationPaginatedResponse = new PublicationPaginatedResponse();
        publicationPaginatedResponse.setPages(publicationResponses);
        publicationPaginatedResponse.setPaginationInfo(paginationInfo);

        return publicationPaginatedResponse;
    }
}
