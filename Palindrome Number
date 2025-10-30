import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int original = num;
        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Check if palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }
}
