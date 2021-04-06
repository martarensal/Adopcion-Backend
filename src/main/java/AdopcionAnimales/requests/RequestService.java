package AdopcionAnimales.requests;

import AdopcionAnimales.animals.Animal;
import AdopcionAnimales.api.animals.*;
import AdopcionAnimales.api.requests.*;
import org.springframework.stereotype.Service;

@Service
public interface RequestService {
    void addRequest(RequestCreationRequest requestCreationRequest);
    RequestPaginatedResponse getRequests(Integer page, Integer size);
    RequestPaginatedResponse getRequestsFromUser(String username, Integer page, Integer size);
    void deleteRequest(Long idRequest);
    void modifyRequestStartDate(RequestStartDateChangeRequest requestStartDateChangeRequest, Long idRequest);
    void modifyRequestEndDate(RequestEndDateChangeRequest requestEndDateChangeRequest, Long idRequest);
    void modifyRequestStatus(RequestStatusChangeRequest requestStatusChangeRequest, Long idRequest);
    void modifyRequestType(RequestTypeChangeRequest requestTypeChangeRequest, Long idRequest);
    Request findRequestById(Long id);
}
