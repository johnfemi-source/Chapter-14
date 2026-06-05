import java.util.Scanner;

public class SearchEngine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = input.nextLine();

        String searchCharacter = "t";
        System.out.println(text.indexOf(searchCharacter));

    }
}