package AdopcionAnimales.test.java.io.swagger.api;

import AdopcionAnimales.api.publications.PublicationDateChangeRequest;
import AdopcionAnimales.api.publications.PublicationsApi;
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
public class PublicationsApiControllerIntegrationTest {

    @Autowired
    private PublicationsApi api;

    @Test
    public void deletePublicationTest() throws Exception {
        Long idRequest = 1l;
        ResponseEntity<Void> responseEntity = api.deletePublication(idRequest);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void modifyPublicationDateTest() throws Exception {
        Long idPublication = 1l;
        PublicationDateChangeRequest body = new PublicationDateChangeRequest();
        ResponseEntity<Void> responseEntity = api.modifyPublicationDate(idPublication, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
