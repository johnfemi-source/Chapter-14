public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "Marv";
        String word2 = "Marvellous";
        if (word1.regionMatches(true, 0, word2, 0, 3)) {
            System.out.println("first 3 characters are equal");
        } else {
            System.out.println("first 3 characters are not equal");
        }
    }
}
