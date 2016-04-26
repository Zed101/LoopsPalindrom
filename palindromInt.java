import java.util.Arrays;
import java.util.Scanner;

public class palindromInt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to check if it's palindrom");
        int number = scan.nextInt();

        int savedEnteredNumber = number;
        int len = String.valueOf(number).length();
        String s = "";
        int temp = 0;


        for (int i = 0; i < len; i++) {
            temp = number % 10;
            number = number / 10;

            s += temp;

        }


        int stringToNumber = Integer.parseInt(s);
       // System.out.println(stringToNumber + " string converted to number");
       // System.out.println(savedEnteredNumber);

        if (stringToNumber == savedEnteredNumber) {
            System.out.println("Entered " + savedEnteredNumber + " is palinrom");
        } else {
            System.out.println("Entered " + savedEnteredNumber + " is not palindrom");
        }


    }
}
