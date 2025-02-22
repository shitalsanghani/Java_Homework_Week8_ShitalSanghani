package java_homework_week8_ss;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */
public class Programme5_PalindromeNumber {

    public static boolean isPalindrome(int number) {//static method withreturntype with parameter
        int enterNumber = number;//variable declaration
        int reverse = 0;//variable declaration

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return enterNumber == reverse;
    }

    public static void main(String[] args) {//main method
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-2332));
        System.out.println(isPalindrome(923329));
        System.out.println(isPalindrome(923729));
    }
}
