package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.api.publications.PublicationPaginatedResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public interface PublicationService {

    void addPublication(PublicationCreationRequest publicationCreationRequest) throws IOException;
    PublicationPaginatedResponse getPublications(Integer page, Integer size) throws IOException;
    PublicationPaginatedResponse getPublicationsFromUser(String username, Integer page, Integer size) throws IOException;
    void deletePublication(Long idAnimal);
    void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, Long idPublication);
    Publication findPublicationById(Long id);
}
