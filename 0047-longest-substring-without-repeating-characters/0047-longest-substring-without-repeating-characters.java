class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> b =new HashSet<>();
      int right=0 ,max=0;
      for(int i=0;i<s.length();i++){
        while(b.contains(s.charAt(i))){
            b.remove(s.charAt(right));
            right++;
        }
        b.add(s.charAt(i));
        max=Math.max(max,i-right+1);
      }   
      return max;
    }
}