package AdopcionAnimales.types;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.PaginationInfo;
import AdopcionAnimales.api.animals.AnimalPaginatedResponse;
import AdopcionAnimales.api.animals.AnimalResponse;
import AdopcionAnimales.api.types.TypeCreationRequest;
import AdopcionAnimales.api.types.TypeNameChangeRequest;
import AdopcionAnimales.api.types.TypePaginatedResponse;
import AdopcionAnimales.api.types.TypeResponse;
import AdopcionAnimales.api.users.UserPaginatedResponse;
import AdopcionAnimales.cities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    @Transactional
    public TypePaginatedResponse getTypes(Integer page, Integer size) {
        Page<Type> matchedTypes = typeRepository.findAllTypes(PageRequest.of(page, size));
        return getTypePaginatedResponse(matchedTypes);
    }

    private TypePaginatedResponse getTypePaginatedResponse(Page<Type> matchedTypes) {
        List<Type> types = matchedTypes.stream().collect(Collectors.toList());

        List<TypeResponse> typeResponses = typeMapper.typeToTypeResponse(types);

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedTypes.getNumberOfElements());
        paginationInfo.setTotalPages(matchedTypes.getTotalPages());

        TypePaginatedResponse paginatedResponse = new TypePaginatedResponse();
        paginatedResponse.setPages(typeResponses);
        paginatedResponse.setPaginationInfo(paginationInfo);

        return paginatedResponse;
    }

}
