import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer code (0-255): ");
        int code = input.nextInt();

        char character = (char) code;

        System.out.println("Character: " + character);

    }
}