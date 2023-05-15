import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex12_Header {

    @Test
    public void getHeaderTest() {

        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/homework_header")
                .andReturn();

        Headers responseHeaders = response.getHeaders();
       //System.out.println(responseHeaders);
        String responseHeaders1 = response.getHeader("Content-Type");
        assertEquals("application/json", responseHeaders1);
    }
}


