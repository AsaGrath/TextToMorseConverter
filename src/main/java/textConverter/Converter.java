package textConverter;

import java.util.HashMap;

public class Converter {



    String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
    };


    public String getMorse(String text) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < alfabet.length(); i++) {
            String letter = Character.toString(alfabet.charAt(i));
            String code = morse[i];
            map.put(letter, code);
          //  map.put(code, letter);
        }

        String myText = "";

        for (int i = 0; i < text.length(); i++) {
            String letter = Character.toString(text.charAt(i));
            myText += map.get(letter) + " ";
        }
        return myText.trim();
    }

    public String getText(String code) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < morse.length; i++) {
            String letter = Character.toString(alfabet.charAt(i));
            String morseCode = morse[i];
            map.put(morseCode, letter);
           // map.put(letter, morseCode);
        }

        String myCode = "";
        String[] codes = code.split(" ");
        for (int i = 0; i < codes.length; i++) {

            //String letter = Character.toString(alfabet.charAt(i));

            myCode += map.get(codes[i]);
    }

        return myCode;
    }
}

//Frågor till Staffan:
//Hur ska metoden veta om den får engelska eller morse?
// Ska man använda 1 eller 2 metoder för att göra det?
//behövs det en konstruktor?
//kan jag slå ihop allt till en metod eller ska jag behålla 2 och rensa upp?
//try catch ska väl ligga i main? för det är där felaktig inmatning kan ske

