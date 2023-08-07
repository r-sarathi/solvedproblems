import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            result.append(str.charAt(i));
        }
        String isPalindrome = (str.equals(result.toString()) ) ? "Given string is Palindrome!" : "Given string is not a palindrome!";
        System.out.println(isPalindrome);
    }
}