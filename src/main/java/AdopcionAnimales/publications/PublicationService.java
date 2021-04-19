package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.api.publications.PublicationPaginatedResponse;
import org.springframework.stereotype.Service;


@Service
public interface PublicationService {

    void addPublication(PublicationCreationRequest publicationCreationRequest);
    //PublicationPaginatedResponse getPublications(Integer page, Integer size);
    //PublicationPaginatedResponse getPublicationsFromUser(String username, Integer page, Integer size);
    void deletePublication(Long idAnimal);
    void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, Long idPublication);
    Publication findPublicationById(Long id);
    PublicationPaginatedResponse obtainUserPublications(String username, Integer page, Integer size);
}
