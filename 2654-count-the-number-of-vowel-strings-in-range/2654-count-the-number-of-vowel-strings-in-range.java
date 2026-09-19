class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int count = 0;

        for (int i = left; i <= right; i++) {
            if (isVowelString(words[i])) {
                count++;
            }
        }

        return count;
    }

    public static boolean isVowelString(String s) {

        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        String vowels = "aeiou";
        return vowels.indexOf(first) != -1 &&
               vowels.indexOf(last) != -1;
    }
}