class Solution {
    public boolean isPowerOfThree(int n) {
        if (n > 0) {
            double x = Math.log(n) / Math.log(3);

            if (Math.abs(x - Math.round(x)) < 1e-10) {
                return true;
            }
        }
        return false;
    }
}