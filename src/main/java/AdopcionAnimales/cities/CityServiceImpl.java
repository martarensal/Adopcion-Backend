package AdopcionAnimales.cities;

import AdopcionAnimales.animals.AnimalsRepository;
import AdopcionAnimales.api.cities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;

@Service
public class CityServiceImpl implements CityService{

    private CityRepository cityRepository;
    private CityMapper cityMapper;
    private AnimalsRepository animalsRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository, CityMapper cityMapper, AnimalsRepository animalsRepository){
        this.cityMapper = cityMapper;
        this.cityRepository = cityRepository;
        this.animalsRepository = animalsRepository;
    }

    @Override
    @Transactional
    public void addCity(CityCreationRequest cityCreationRequest) throws ConstraintViolationException {
        City city = cityMapper.cityCreationRequestToCity(cityCreationRequest);
        try {
            cityRepository.save(city);
        } catch (ConstraintViolationException exception) {
            exception.getMessage();
        }
    }

    @Override
    @Transactional
    public void deleteCity(Long idCity) {
        City city = findCity(idCity);
        cityRepository.delete(city);
    }

    @Override
    @Transactional
    public CityResponse getCity(Long idCity) {
        return null;
    }

    private City findCity(Long idCity) {
        City city = cityRepository.findByCityId(idCity);
        if(city == null)
            throw new EntityNotFoundException("No se ha encontrado la ciudad " + idCity);
        return city;
    }

    @Override
    @Transactional
    public void modifyCityName(CityNameChangeRequest cityNameChangeRequest, Long idCity) {
        City city = findCity(idCity);

        city.setName(cityNameChangeRequest.getNewCityName());
        cityRepository.save(city);
    }

    @Override
    @Transactional
    public void modifyCityProvince(CityProvinceChangeRequest cityProvinceChangeRequest, Long idCity) {
        City city = findCity(idCity);

        city.setProvince(cityProvinceChangeRequest.getNewCityProvince());
        cityRepository.save(city);
    }

    @Override
    @Transactional
    public void modifyCityAutonomousCommunity(CityAutonomousCommunityChangeRequest cityAutonomousCommunityChangeRequest, Long idCity) {
        City city = findCity(idCity);

        city.setAutonomousCommunity(cityAutonomousCommunityChangeRequest.getNewCityAutonomousCommunity());
        cityRepository.save(city);
    }
}
