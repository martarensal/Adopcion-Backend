package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.animals.AnimalImageChangeRequest;
import AdopcionAnimales.api.animals.AnimalNameChangeRequest;
import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.publications.*;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public interface PublicationService {

    void addPublication(PublicationCreationRequest publicationCreationRequest) throws IOException;
    PublicationPaginatedResponse getPublications(Integer page, Integer size) throws IOException;
    PublicationPaginatedResponse getPublicationsFromUser(String username, Integer page, Integer size) throws IOException;
    void deletePublication(Long idAnimal);
    void modifyPublicationImage(PublicationImageChangeRequest publicationImageChangeRequest, Long idPublication);
    void modifyPublicationDescription(PublicationDescriptionChangeRequest publicationDescriptionChangeRequest, Long idPublication);
    void modifyPublicationDate(PublicationDateChangeRequest publicationDateChangeRequest, Long idPublication);
    Publication findPublicationById(Long id);
}
