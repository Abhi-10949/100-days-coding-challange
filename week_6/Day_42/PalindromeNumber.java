public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // For even digits: x == reversed
        // For odd digits: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println("Is 121 a palindrome? " + solution.isPalindrome(x1));
        System.out.println("Is -121 a palindrome? " + solution.isPalindrome(x2));
        System.out.println("Is 10 a palindrome? " + solution.isPalindrome(x3));
    }
}
