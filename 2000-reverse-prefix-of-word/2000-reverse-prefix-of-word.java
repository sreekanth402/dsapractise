class Solution {
    public String reversePrefix(String word, char ch) {
        int c = -1;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                c = i;
                break;
            }
        }

        if(c == -1) return word;

        StringBuilder b =
            new StringBuilder(word.substring(0, c + 1));

        b.reverse();

        b.append(word.substring(c + 1));

        return b.toString();
    }
}