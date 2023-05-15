import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex11_Cookie {

    @Test
    public void cookieTest() {

        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/homework_cookie")
                .andReturn();

        String responseCookies = String.valueOf(response.getCookies());
        assertEquals("{HomeWork=hw_value}", responseCookies);
    }
}
