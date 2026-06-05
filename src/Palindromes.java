import java.util.Scanner;

public class Palindromes{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = input.nextLine();

        String reversedWord = "";

        for(int count = word.length() - 1; count >= 0; count--){
            reversedWord += word.charAt(count);
        }

        if(word.equals(reversedWord)){
            System.out.println("Palindrome");
        }

        else{
            System.out.println("Not a palindrome");
        }
    }
}