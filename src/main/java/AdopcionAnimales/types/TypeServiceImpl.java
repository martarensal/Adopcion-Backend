package AdopcionAnimales.types;

import AdopcionAnimales.api.types.TypeCreationRequest;
import AdopcionAnimales.api.types.TypeNameChangeRequest;
import AdopcionAnimales.api.types.TypeResponse;
import AdopcionAnimales.cities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.validation.ConstraintViolationException;

@Service
public class TypeServiceImpl implements TypeService{

    private TypeRepository typeRepository;
    private TypeMapper typeMapper;

    @Autowired
    public TypeServiceImpl(TypeMapper typeMapper, TypeRepository typeRepository) {
        this.typeMapper = typeMapper;
        this.typeRepository = typeRepository;
    }

    @Override
    public void addType(TypeCreationRequest typeCreationRequest) throws ConstraintViolationException {
        Type type = typeMapper.typeCreationRequestToType(typeCreationRequest);
        try {
            typeRepository.save(type);
        } catch (ConstraintViolationException exception) {
            exception.getMessage();
        }
    }

    @Override
    public void deleteType(Long idType) {
        Type type = findType(idType);
        typeRepository.delete(type);
    }

    @Override
    public TypeResponse getType(Long idType) {
        return null;
    }

    @Override
    public void modifyTypeName(TypeNameChangeRequest typeNameChangeRequest, Long idType) {
        Type type = findType(idType);

        type.setName(typeNameChangeRequest.getNewTypeName());
        typeRepository.save(type);
    }
    private Type findType(Long idType) {
        Type type = typeRepository.findByTypeId(idType);
        if(type == null)
            throw new EntityNotFoundException("No se ha encontrado el id " + idType);
        return type;
    }
}
