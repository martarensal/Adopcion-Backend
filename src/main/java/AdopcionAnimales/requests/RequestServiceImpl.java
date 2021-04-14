package AdopcionAnimales.requests;

import AdopcionAnimales.api.requests.*;
import AdopcionAnimales.users.User;
import AdopcionAnimales.users.UsersRepository;
import AdopcionAnimales.utils.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
public class RequestServiceImpl implements RequestService{
    private RequestMapper requestMapper;
    private RequestRepository requestRepository;
    private UsersRepository usersRepository;

    public RequestServiceImpl(RequestMapper requestMapper, RequestRepository requestRepository, UsersRepository usersRepository) {
        this.requestMapper = requestMapper;
        this.requestRepository = requestRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    @Transactional
    public void addRequest(RequestCreationRequest requestCreationRequest) {
        Request newRequest = requestMapper.requestCreationRequestToRequest(requestCreationRequest);
        User user = getUser();
        user.getRequests().add(requestRepository.save(newRequest));

        usersRepository.save(user);
        requestRepository.save(newRequest);
    }

    @Override
    @Transactional
    public RequestPaginatedResponse getRequests(Integer page, Integer size) {
        return null;
    }

    @Override
    @Transactional
    public RequestPaginatedResponse getRequestsFromUser(String username, Integer page, Integer size) {
        return null;
    }

    @Override
    @Transactional
    public void deleteRequest(Long idRequest) {
        Request request = findRequestById(idRequest);
        User user = getUser();
        user.getRequests().remove(request);

        usersRepository.save(user);
        requestRepository.delete(request);
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
        if(request != null) {
            request.setStatus(requestStatusChangeRequest.getNewRequestStatus());
            requestRepository.save(request);
        }
    }

    @Override
    @Transactional
    public void modifyRequestType(RequestTypeChangeRequest requestTypeChangeRequest, Long idRequest) {
        Request request = findRequestById(idRequest);
        if(request != null) {
            request.setTypeRequest(requestTypeChangeRequest.getNewRequestType());
            requestRepository.save(request);
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
