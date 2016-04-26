import java.util.Scanner;


public class palindromWhilStr {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check if it's palindrom number");
        String s = scan.nextLine();
        String reverseString = "";
        int len = s.length();

         while (len != 0){
             len--;
         reverseString +=  s.charAt(len);

         }
        if(reverseString.equals(s)){
            System.out.println("Entered number " + s + " is palindrom");
        }else {
            System.out.println("Entered number " + s + " isn't palindrom");
        }
       // System.out.println(reverseString);
    }
}
