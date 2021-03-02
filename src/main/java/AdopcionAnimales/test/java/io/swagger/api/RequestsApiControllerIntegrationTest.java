package AdopcionAnimales.test.java.io.swagger.api;

import AdopcionAnimales.api.requests.RequestCreationRequest;
import AdopcionAnimales.api.requests.RequestPaginatedResponse;
import AdopcionAnimales.api.requests.RequestsApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestsApiControllerIntegrationTest {

    @Autowired
    private RequestsApi api;

    @Test
    public void addRequestTest() throws Exception {
        RequestCreationRequest body = new RequestCreationRequest();
        ResponseEntity<Void> responseEntity = api.addRequest(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteRequestTest() throws Exception {
        String idRequest = "idRequest_example";
        ResponseEntity<Void> responseEntity = api.deleteRequest(idRequest);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void obtainRequestsTest() throws Exception {
        Integer page = 56;
        Integer size = 56;
        ResponseEntity<RequestPaginatedResponse> responseEntity = api.obtainRequests(page, size);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
