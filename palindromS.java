import java.util.Scanner;


public class palindromS {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to check if it's palindrom");
        String s = scan.nextLine();
        String reverseString = "";

        for(int i = s.length()-1; i >= 0; i--){
           // System.out.println(s.charAt(i));
            reverseString += s.charAt(i);
        }
        System.out.println(reverseString);
        if(s.equals(reverseString)){
            System.out.println("Entered number " + s + " is palindrom");
        }else{
            System.out.println("Entered number " + s + " isn't palindrom");
        }
    }
}
