import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = words[0];

        for (int value = 1; value < words.length; value++) {
            if (words[value].length() > longestWord.length()) {
                longestWord = words[value];
            }
        }

        System.out.println("Longest word: " + longestWord);

    }
}