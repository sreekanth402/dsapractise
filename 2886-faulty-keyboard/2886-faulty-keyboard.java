class Solution {
    public String finalString(String s) {
        StringBuilder b =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                b.reverse();
            }
            else {
                b.append(s.charAt(i));
            }
        }
        return b.toString();
    }
}