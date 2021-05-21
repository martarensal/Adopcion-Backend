package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.animals.AnimalsRepository;
import AdopcionAnimales.api.utils.PaginationInfo;
import AdopcionAnimales.api.requests.*;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import AdopcionAnimales.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestServiceImpl implements RequestService{
    private RequestMapper requestMapper;
    private RequestRepository requestRepository;
    private UsersRepository usersRepository;
    private AnimalsRepository animalsRepository;

    @Autowired
    public RequestServiceImpl(RequestMapper requestMapper, RequestRepository requestRepository, UsersRepository usersRepository, AnimalsRepository animalsRepository) {
        this.requestMapper = requestMapper;
        this.requestRepository = requestRepository;
        this.usersRepository = usersRepository;
        this.animalsRepository = animalsRepository;
    }

    @Override
    @Transactional
    public void addRequest(RequestCreationRequest requestCreationRequest) {
        Request newRequest = requestMapper.requestCreationRequestToRequest(requestCreationRequest);
        User user = getUser();

        newRequest.setUser(user);

        System.out.println("primero"+ newRequest.getType());

        user.getRequests().add(requestRepository.save(newRequest));

        usersRepository.save(user);
        requestRepository.save(newRequest);

    }

    @Override
    @Transactional
    public RequestPaginatedResponse getRequests(Integer page, Integer size) {
        Page<Request> matechedRequests = requestRepository.getRequests(PageRequest.of(page, size));
        return getRequestPaginatedResponse(matechedRequests);

    }

    @Override
    @Transactional
    public RequestPaginatedResponse getRequestsFromUser(String username, Integer page, Integer size) {
        Page<Request> matchedRequests = requestRepository.getRequestsFromUsers(username, PageRequest.of(page, size));
        return getRequestPaginatedResponse(matchedRequests);
    }

    private RequestPaginatedResponse getRequestPaginatedResponse(Page<Request> matchedRequest) {
        List<Request> requests = matchedRequest.stream().collect(Collectors.toList());

        List<RequestResponse> requestResponses = requestMapper.requestToRequestResponse(requests);

        PaginationInfo paginationInfo = new PaginationInfo();
        paginationInfo.setTotalElements(matchedRequest.getNumberOfElements());
        paginationInfo.setTotalPages(matchedRequest.getTotalPages());

        RequestPaginatedResponse paginatedResponse = new RequestPaginatedResponse();
        paginatedResponse.setPages(requestResponses);
        paginatedResponse.setPaginationInfo(paginationInfo);

        return paginatedResponse;
    }

    @Override
    @Transactional
    public void deleteRequest(Long idRequest) {
        Request request = findRequestById(idRequest);
        if(request != null){
            Animal animal = animalsRepository.findById(request.getAnimal().getId()).orElse(null);
            User user = getUser();

            if(animal != null)
            {
                user.getRequests().remove(request);
                animal.getRequest().remove(request);

                requestRepository.delete(request);
                animalsRepository.save(animal);
                usersRepository.save(user);
            }
        }
    }

    @Override
    @Transactional
    public void modifyRequestStartDate(RequestStartDateChangeRequest requestStartDateChangeRequest, Long idRequest) {
        Request request = findRequestById(idRequest);
        request.setStartDate(requestStartDateChangeRequest.getNewRequestStartDate());

        requestRepository.save(request);
    }

    @Override
    @Transactional
    public void modifyRequestEndDate(RequestEndDateChangeRequest requestEndDateChangeRequest, Long idRequest) {
        Request request = findRequestById(idRequest);
        request.setEndDate(requestEndDateChangeRequest.getNewRequestEndDate());

        requestRepository.save(request);
    }

    @Override
    @Transactional
    public void modifyRequestStatus(RequestStatusChangeRequest requestStatusChangeRequest, Long idRequest) {
        Request request = findRequestById(idRequest);
        String requestUpperCase = requestStatusChangeRequest.getNewRequestStatus().toUpperCase();

        if(request != null) {
            for(RequestStatusChangeRequest.NewRequestStatusEnum newRequestStatusEnum : RequestStatusChangeRequest.NewRequestStatusEnum.values())
            {
                if(newRequestStatusEnum.name().toUpperCase().equals(requestUpperCase)){
                    request.setStatus(requestUpperCase);
                    requestRepository.save(request);
                }
            }
        }

    }

    @Override
    @Transactional
    public void modifyRequestType(RequestTypeChangeRequest requestTypeChangeRequest, Long idRequest) {
        Request request = findRequestById(idRequest);
        String requestUpperCase = requestTypeChangeRequest.getNewRequestType().toUpperCase();

        if(request != null) {
            for(RequestTypeChangeRequest.NewRequestTypeEnum newRequestTypeEnum : RequestTypeChangeRequest.NewRequestTypeEnum.values())
            {
                if(newRequestTypeEnum.name().toUpperCase().equals(requestUpperCase)){
                    request.setType(requestUpperCase);
                    requestRepository.save(request);
                }
            }
        }

    }

    @Override
    @Transactional
    public Request findRequestById(Long id) {
        return requestRepository.findById(id).orElse(null);
    }

    private User getUser() {
        User user = usersRepository.findUserByUsername(SecurityUtils.currentUserUsername());
        if (user == null)
            throw new EntityNotFoundException("Usuario no encontrado");
        return user;
    }
}
