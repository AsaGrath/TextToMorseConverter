package textConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BabelFish {
    static void main(String[] args) {

        Converter converter = new Converter();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to BabelFish");
        while (true) {
            System.out.println("Press 1 for English, 2 for Morse and 3 to stop");
            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.println("Write you text, use A-Z");
                String text = scan.nextLine();
                text = converter.getMorse(text);
                System.out.println(text);
            } else if (choice == 2) {
                System.out.println("Write your Morse, please use space to separate letters");
                String code = scan.nextLine();
                code = converter.getText(code);
                System.out.println(code);
            } else if (choice == 3) {
                System.out.println("Byebye!");
                break;
            } else {
                System.out.println("Choose 1-3");
            }
        }
    }
}










