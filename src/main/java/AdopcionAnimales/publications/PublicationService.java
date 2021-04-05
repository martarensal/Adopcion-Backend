package AdopcionAnimales.publications;

import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public interface PublicationService {
    void addPublication(PublicationCreationRequest publicationCreationRequest, String username);
    PublicationResponse getPublicationByUsername(String username) throws EntityNotFoundException;
    void deletePublication(Long idPublication) throws IllegalArgumentException;
    void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, String username, Long idPublication);
    //PublicationPaginatedResponse searchPublications(String username, Integer page, Integer size);

}
