package AdopcionAnimales.types;

import AdopcionAnimales.api.cities.CityCreationRequest;
import AdopcionAnimales.api.cities.CityNameChangeRequest;
import AdopcionAnimales.api.cities.CityResponse;
import AdopcionAnimales.api.types.TypeCreationRequest;
import AdopcionAnimales.api.types.TypeNameChangeRequest;
import AdopcionAnimales.api.types.TypeResponse;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

@Service
public interface TypeService {
    void addType(TypeCreationRequest typeCreationRequest) throws ConstraintViolationException;;
    void deleteType(Long idType);
    TypeResponse getType(Long idType);
    //TypePaginatedResponse getTypes();
    void modifyTypeName(TypeNameChangeRequest typeNameChangeRequest, Long idType);
}
