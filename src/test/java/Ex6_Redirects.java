import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Ex6_Redirects {

    @Test
    public void redirectTest() {

        Response response1 = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();

        String link = response1.getHeader("Location");
        System.out.println(link);

    }
}





