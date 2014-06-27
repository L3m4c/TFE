package User;

import org.apache.catalina.util.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sl0th on 27/06/2014.
 */
@RunWith(JUnit4.class)
public class UserAuth {

    static HttpHeaders getHeaders(String auth) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String encodedAuthorisation = Base64.encode(auth.getBytes());
        headers.add("Authorization", "Basic " + new String(encodedAuthorisation));
        return headers;
    }

    @Test
    public void auth() {
        HttpEntity<String> requestEntity = new HttpEntity<String>(
                getHeaders("damien.vinsous" + ":" + "dam"));
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> entity = template.exchange("http://localhost:8080/meal", HttpMethod.GET, requestEntity, String.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }

    @Test
    public void unAuth() {
        HttpEntity<String> requestEntity = new HttpEntity<String>(new HttpHeaders());
        RestTemplate template = new RestTemplate();
        try {
            ResponseEntity<String> entity = template.exchange("http://localhost:8080/meal", HttpMethod.GET, requestEntity, String.class);
            assertEquals(HttpStatus.UNAUTHORIZED, entity.getStatusCode());
        }catch(HttpClientErrorException ex) {
            assertEquals(HttpStatus.UNAUTHORIZED, ex.getStatusCode());
        }
    }

}
