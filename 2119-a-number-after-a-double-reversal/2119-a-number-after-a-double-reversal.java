class Solution {
    public boolean isSameAfterReversals(int num) {
        int original = num;

        // First reversal
        int rev1 = 0, n = num;
        while (n != 0) {
            int digit = n % 10;
            rev1 = rev1 * 10 + digit;
            n /= 10;
        }

        // Second reversal
        int rev2 = 0;
        n = rev1;
        while (n != 0) {
            int digit = n % 10;
            rev2 = rev2 * 10 + digit;
            n /= 10;
        }

        return rev2 == original;
    }
}
