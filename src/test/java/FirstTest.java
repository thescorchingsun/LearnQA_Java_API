import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void helloWorldTest() {
        System.out.println("Hello from Natalia");
    }

    @Test
    public void getHelloWorldTest(){
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
