package AdopcionAnimales.publications;

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
    public void addPublication(PublicationCreationRequest publicationCreationRequest, String username) {
        Publication publication = getPublication(publicationCreationRequest);
        User user = getUser(username);
        publication.setUser(user);
        user.getPublications().add(publicationRepository.save(publication));

        publicationRepository.save(publication);
        usersRepository.save(user);
    }

    @Override
    public PublicationResponse getPublicationByUsername(String username) throws EntityNotFoundException {
        return null;
    }

    @Override
    public void deletePublication(Long idPublication) throws IllegalArgumentException {
        Publication publication = publicationRepository.findById(idPublication).orElse(null);
        if (publication == null)
            throw new IllegalArgumentException("La publicacion con id " + idPublication + " no ha sido encontrado");

        publicationRepository.delete(publication);
    }

    @Override
    public void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, String username, Long idPublication) {
        Publication publication = publicationRepository.findById(idPublication).orElse(null);
        publication.setPublicationDate(publicationDateChangeRequest.getNewPublicationDate());

        publicationRepository.save(publication);
    }

    private Publication getPublication(PublicationCreationRequest publicationCreationRequest) {
        Publication publication = publicationMapper.publicationCreationRequestToPublication(publicationCreationRequest);
        return publication;
    }

    private User getUser(String username) {
        User user = usersRepository.findUserByUsername(username);
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }
}
