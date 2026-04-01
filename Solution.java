public class Solution {

    // Approach 1: Convert to string (simple)
    public boolean isPalindromeString(int x) {
        String s = Integer.toString(x);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Approach 2: Reverse half of the number (no string conversion)
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Also, numbers ending with 0 are not palindromes unless the number is 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // For even length: x == reversed
        // For odd length: x == reversed / 10 (the middle digit is ignored)
        return x == reversed || x == reversed / 10;
    }
}