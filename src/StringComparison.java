import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a word: ");
        String firstWord = input.nextLine();

        System.out.println("Enter a word: ");
        String secondWord = input.nextLine();

        System.out.println("Enter number of characters: ");
        int numberOfCharacter = input.nextInt();

        System.out.println("Enter starting index: ");
        int startIndex = input.nextInt();

        if(firstWord.regionMatches(0, secondWord,2, 5)){
            System.out.println("The words match");
        }
        else{
            System.out.println("The words do not match");
        }

    }
}