class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            if (check(allowed, word)) {
                count++;
            }
        }
        return count;
    }
    public boolean check(String allowed, String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (allowed.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
