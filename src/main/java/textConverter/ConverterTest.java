package textConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    @Test
    public void testConvertAToMorse() {
        Converter converter = new Converter();
        String text = "A";

        String actual = converter.getMorse(text);
        String expected = ".-";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertAZToMorse() {
        Converter converter = new Converter();
        String text = "AZ";

        String actual = converter.getMorse(text);
        String expected = ".- --..";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertTextToMorse() {
        Converter converter = new Converter();
        String text = "HELLOWORLD";

        String actual = converter.getMorse(text);
        String expected = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToA() {
        Converter converter = new Converter();
        String code = ".-";

        String actual = converter.getText(code);
        String expected = "A";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToAZ() {
        Converter converter = new Converter();
        String code = ".- --..";

        String actual = converter.getText(code);
        String expected = "AZ";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToText() {
        Converter converter = new Converter();
        String code = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";

        String actual = converter.getText(code);
        String expected = "HELLOWORLD";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumbers() {
        Converter converter = new Converter();
        String text = "123";

        String actual = converter.getMorse(text);
        String expected = "Invalid input";

        assertEquals(expected, actual);
    }

    @Test
    public void testNoInput() {
        Converter converter = new Converter();
        String text = "";

        String actual = converter.getMorse(text);
        String expected = "No input";

        assertEquals(expected, actual);
    }

    @Test
    public void testMultipleSpaces() {
        Converter converter = new Converter();
        String text = "       ";

        String actual = converter.getMorse(text);
        String expected = "No input";

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidInputInMorse() {
        Converter converter = new Converter();
        String code = "HELLO";

        String actual = converter.getText(code);
        String expected = "Invalid input";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertLettersAndSpecialCharacter() {
        Converter converter = new Converter();
        String text = "HELLO!";

        String actual = converter.getMorse(text);
        String expected = "Invalid input";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertLowerCases() {
        Converter converter = new Converter();
        String text = "helloworld";

        String actual = converter.getMorse(text);
        String expected = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";

        assertEquals(expected, actual);
    }

    @Test
    public void testSpecialCharacters() {
        Converter converter = new Converter();
        String text = "ÅÄÖ!#%&";

        String actual = converter.getText(text);
        String expected = "Invalid input";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertSpaceBetweenWords() {
        Converter converter = new Converter();
        String text = "HELLO WORLD";

        String actual = converter.getMorse(text);
        String expected = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";

        assertEquals(expected, actual);
    }
}
