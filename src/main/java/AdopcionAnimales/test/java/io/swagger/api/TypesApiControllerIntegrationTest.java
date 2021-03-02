package AdopcionAnimales.test.java.io.swagger.api;


import AdopcionAnimales.api.types.TypesApi;
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
public class TypesApiControllerIntegrationTest {

    @Autowired
    private TypesApi api;

    @Test
    public void deleteTypeTest() throws Exception {
        String idType = "idType_example";
        ResponseEntity<Void> responseEntity = api.deleteType(idType);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
