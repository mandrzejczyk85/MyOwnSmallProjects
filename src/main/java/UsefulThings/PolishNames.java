package UsefulThings;

import java.util.Scanner;

public class PolishNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba")) {
            System.out.println("Jesteś mężczyzną a Twoje imię to: " + name);
        } else {
            System.out.println("Jesteś kobietą a Twoje imię to: " + name);
        }
    }
}
