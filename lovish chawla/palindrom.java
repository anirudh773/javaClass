class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return flase;
        int rev = 0, r, a = x;
        while (x != 0) {
            r = x % 10;
            rev = rev * 10 + r;
            x /= 10;
        }
        return a == rev;
    }
}
