public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int reverse = 0;
        int y = x;
        while (y != 0) {
            reverse = 10 * reverse + y % 10;
            y /= 10;
        }
        return ((x - reverse) == 0);
    }
}