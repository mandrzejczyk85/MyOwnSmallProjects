package UsefulThings;

import java.util.Scanner;

public class RemovingPolishChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Wpisz wyraz z polskimi znakami a ja go przerobię na wyraz bez polskich znaków");
        while(true) {
            String polishWord = scanner.nextLine();
            String noPolishChars = polishWord
                    .replace("ą", "a").replace("ć", "c").replace("ę", "e")
                    .replace("ł", "l").replace("ń", "n").replace("ó", "o")
                    .replace("ś", "s").replace("ź", "z").replace("ż", "z")
                    .replace("Ą", "A").replace("Ć", "C").replace("Ę", "E")
                    .replace("Ł", "L").replace("Ń", "N").replace("Ó", "O")
                    .replace("Ś", "S").replace("Ź", "Z").replace("Ż", "Z");
            System.out.println(noPolishChars);
        }
    }
}
