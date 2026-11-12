package textConverter;

import java.util.HashMap;

public class Converter {


    private HashMap<String, String> map;


    public Converter() {
        map = new HashMap<>();
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", "/"};

        for (int i = 0; i < alfabet.length(); i++) {
            String letter = Character.toString(alfabet.charAt(i));
            String code = morse[i];
            map.put(letter, code);
            map.put(code, letter);
        }
    }
    public String getMorse(String text) {
        text = text.toUpperCase();
        String myText = "";
        if (text.isBlank()) {
            return "No input";
        }

        for (int i = 0; i < text.length(); i++) {
            String letter = Character.toString(text.charAt(i));

            String translated = map.get(letter);
            if (translated == null) {
                return "Invalid input";
            }
            myText += map.get(letter) + " ";
        }
        return myText.trim();
    }

    public String getText(String code) {
        if (code.isBlank()) {
            return "No input";
        }
        String myCode = "";
        String[] codes = code.split(" ");
        for (int i = 0; i < codes.length; i++) {
            String translated = map.get(codes[i]);
            if (translated == null) {
                return "Invalid input";
            }
            myCode += map.get(codes[i]);
        }
        return myCode;
    }
}


