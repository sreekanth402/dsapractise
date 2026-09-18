class Solution {
    public int secondHighest(String s) {

        int max = -1;
        int max2 = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (digit > max) {
                    max2 = max;
                    max = digit;
                } else if (digit != max && digit > max2) {
                    max2 = digit;
                }
            }
        }

        return max2;
    }
}