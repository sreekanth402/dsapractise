class Solution {
    public String reversePrefix(String s, int k) {
         StringBuilder b = new StringBuilder();
       for(int i=k-1;i>=0;i--){
        b.append(s.charAt(i));
       }
       for(int i=k;i<s.length();i++){
        b.append(s.charAt(i));
       }
        return b.toString();
        
    }
}