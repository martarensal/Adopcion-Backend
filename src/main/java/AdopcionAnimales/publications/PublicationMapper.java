package AdopcionAnimales.publications;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.cities.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublicationMapper {
    List<PublicationResponse> publicationToPublicationResponse (List<Publication> publication);
    Publication publicationCreationRequestToPublication(PublicationCreationRequest publicationCreationRequest);

}
