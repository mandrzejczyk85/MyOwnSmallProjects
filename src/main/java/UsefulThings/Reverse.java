package UsefulThings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String one = scanner.nextLine();
            System.out.println(reverse(one));
        }
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
