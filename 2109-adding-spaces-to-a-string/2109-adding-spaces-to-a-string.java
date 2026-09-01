class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder b = new StringBuilder();
        int spaceIndex = 0; // pointer for spaces array

        for (int i = 0; i < s.length(); i++) {
            // if current position matches a space index, insert space
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                b.append(" ");
                spaceIndex++;
            }
            b.append(s.charAt(i));
        }
        return b.toString();
    }
}
