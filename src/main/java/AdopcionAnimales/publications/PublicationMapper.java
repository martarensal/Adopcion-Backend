package AdopcionAnimales.publications;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.publications.PublicationCreationRequest;
import AdopcionAnimales.api.publications.PublicationResponse;
import AdopcionAnimales.cities.City;
import AdopcionAnimales.users.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PublicationMapper {
    default Long publicationToLong(Publication p) { return p.getId();}
    public default Long userToLong(User u) { return u.getIdUser();}

    List<PublicationResponse> publicationToPublicationResponse (List<Publication> publication);
    Publication publicationCreationRequestToPublication(PublicationCreationRequest publicationCreationRequest);

}
