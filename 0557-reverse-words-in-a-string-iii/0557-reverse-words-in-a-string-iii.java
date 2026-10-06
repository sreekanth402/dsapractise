class Solution {
    public String reverseWords(String s) {
        String[] r = s.split(" ");
        StringBuilder re = new StringBuilder();

        for(String c : r){
            StringBuilder f = new StringBuilder(c).reverse();
            re.append(f).append(" ");
        }

        return re.toString().trim();
    }
}