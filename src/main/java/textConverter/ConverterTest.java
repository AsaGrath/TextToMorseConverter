package textConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    @Test
    public void testConvertAToMorse() {
        Converter convert = new Converter();
        String text = "A";

        String actual = convert.getMorse(text);
        String expected = ".-";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertAZToMorse() {
        Converter convert = new Converter();
        String text = "AZ";

        String actual = convert.getMorse(text);
        String expected = ".- --..";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertTextToMorse() {
        Converter convert = new Converter();
        String text = "HELLOWORLD";

        String actual = convert.getMorse(text);
        String expected = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToA() {
        Converter convert = new Converter();
        String code = ".-";

        String actual = convert.getText(code);
        String expected = "A";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToAZ() {
        Converter convert = new Converter();
        String code = ".- --..";

        String actual = convert.getText(code);
        String expected = "AZ";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToText() {
        Converter convert = new Converter();
        String code = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";

        String actual = convert.getText(code);
        String expected = "HELLOWORLD";

        assertEquals(expected, actual);
    }


    //massor av mellanslag
    //lämna tomt
    //små bokstäver
    //siffror
    //morsekod utan mellanslag
}
