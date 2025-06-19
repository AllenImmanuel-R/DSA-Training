import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = sc.nextLine();
        String reverse ="";
        for(int i=str.length();i>0;i--)
        {
            reverse += str.charAt(i-1);
        }
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse);
        if (str.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
