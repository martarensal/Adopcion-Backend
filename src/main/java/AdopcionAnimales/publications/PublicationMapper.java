package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.cities.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublicationMapper {
    public default Long publicationToLong(Publication p) { return p.getId();}

    List<PublicationResponse> publicationToPublicationResponse (List<Publication> publication);
    Publication publicationCreationRequestToPublication(PublicationCreationRequest publicationCreationRequest);

}
