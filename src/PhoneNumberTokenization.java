import java.util.Scanner;

public class PhoneNumberTokenization {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        String [] token = number.split("[\\s()\\-]+");

        String areaCode  = token[0];
        String firstThreeNumber = token[1];
        String lastFourNumber = token[2];

        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append(firstThreeNumber).append(lastFourNumber);

        System.out.println(areaCode);
        System.out.println(phoneNumber.toString());
    }
}


