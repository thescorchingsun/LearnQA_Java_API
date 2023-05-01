import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

public class Ex5_JSONParsing {

    @Test
    public void jsonParsingTest(){
        JsonPath response = RestAssured
                .given()
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        String message2 = response.get("messages.message[1]");
        System.out.println(message2);
    }
}
