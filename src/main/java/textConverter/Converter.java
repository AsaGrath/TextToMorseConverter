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
        //map.put("A", ".-");
        //map.put("Z", "--..");

        for (int i = 0; i < alfabet.length(); i++) {
            String letter = Character.toString(alfabet.charAt(i));
            String code = morse[i];
            map.put(letter, code);
            map.put(code, letter);
        }

        String myText = "";

        for (int i = 0; i < text.length(); i++) {
            String letter = Character.toString(text.charAt(i));
            myText += map.get(letter) + " ";
        }
        return myText.trim();
    }

    public String getText(String code) {
        return "A";
    }
}


      /*  String myCode = "";
        for (int i = 0; i < morse.length(); i++) {
            String letter = Character.toString(text.charAt(i));
            myText += map.get(letter) + " ";*/




    //Frågor till Staffan:
    //Hur ska metoden veta om den får engelska eller morse? Ska man använda 1 eller 2 metoder för att göra det

