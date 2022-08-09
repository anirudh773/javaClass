class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long temp = n;
        while (temp > 0) {
            if (temp % 2 == 1) {
                ans = ans * x;
                temp--;

            } else {
                x = x * x;
                temp = temp / 2;
            }
        }
        return ans;
    }

}
