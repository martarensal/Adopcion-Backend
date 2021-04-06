package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.requests.*;
import AdopcionAnimales.publications.Publication;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RequestServiceImpl implements RequestService{
    private RequestMapper requestMapper;
    private RequestRepository requestRepository;

    public RequestServiceImpl(RequestMapper requestMapper, RequestRepository requestRepository) {
        this.requestMapper = requestMapper;
        this.requestRepository = requestRepository;
    }

    @Override
    @Transactional
    public void addRequest(RequestCreationRequest requestCreationRequest) {
        Request newRequest = requestMapper.requestCreationRequestToRequest(requestCreationRequest);
        if(newRequest.getStatus() == "Adoption"){
            newRequest.setEndDate(null);
        }
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
}
