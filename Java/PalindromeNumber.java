import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int result = 0;
        while(temp > 0) {
            int remainder = temp % 10;
            result = (result * 10) + remainder;
            temp /= 10;
        }
        String isPalindrome = (num == result) ? "Given number is Palindrome!" : "Given number is not a palindrome!";
        System.out.println(isPalindrome);
    }
}