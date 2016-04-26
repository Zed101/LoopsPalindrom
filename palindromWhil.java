import java.util.Scanner;


public class palindromWhil {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number tu check if it's palindrom");
        int number = scan.nextInt();
        int savedEnteredNumber = number;
        int reversedNumber = 0;
        String s = "";


        while(number != 0){

            reversedNumber = number % 10;
            number--;
            number = number /10;
            s += reversedNumber;

        }
        int convertToInt = Integer.parseInt(s);


        if(savedEnteredNumber == convertToInt){
            System.out.println("Entered number " + savedEnteredNumber + " is palindrom" );
        }else{
            System.out.println("Entered number " + savedEnteredNumber + " isn't palindrom");
        }

    }
}
