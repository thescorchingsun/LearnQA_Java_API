import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Ex10_ShortPhrase {

    @Test
    public void lengthCheckTest() {

        String text = "воздухоплаватель";

        int letterCount = text.length();

        assertTrue(letterCount > 15,"Ошибка - текст равен " + letterCount + " символам");
        System.out.println("Успех - текст длиннее 15 символов");
    }
}
