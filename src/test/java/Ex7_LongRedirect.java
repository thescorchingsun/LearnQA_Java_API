import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class Ex7_LongRedirect {

    @Test
    public void LongRedirectTest() {

        String link = "https://playground.learnqa.ru/api/long_redirect";
        int redirects = 0;

        do {
            Response response = RestAssured
                    .given()
                    .redirects()
                    .follow(false)
                    .when()
                    .get(link)
                    .andReturn();

            int statusCode = response.getStatusCode();
            if (statusCode == 200) {
                System.out.println(response.getHeader("Location"));
                System.out.println(statusCode);
                break;
            } else {
                link = response.getHeader("Location");
                redirects++;
                System.out.println(response.getHeader("Location"));
                System.out.println(statusCode);
            }
        } while (link != null);

        System.out.println(redirects);

    }
}
