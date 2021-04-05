package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

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
        publicationRepository.save(newPublication);
    }

    @Override
    @Transactional
    public void deletePublication(Long idPublication) throws IllegalArgumentException {
        Publication publication = findPublicationById(idPublication);
        publicationRepository.delete(publication);
    }

    @Override
    public void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, Long idPublication) {
        Publication publication = findPublicationById(idPublication);
        publication.setPublicationDate(publicationDateChangeRequest.getNewPublicationDate());

        publicationRepository.save(publication);
    }

    private User getUser(String username) {
        User user = usersRepository.findUserByUsername(username);
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }

    @Override
    @Transactional
    public Publication findPublicationById(Long id) {
        return publicationRepository.findById(id).orElse(null);
    }
}
