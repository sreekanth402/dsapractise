class Solution {
    public String mergeAlternately(String word1, String word2) {
       char [] a =word1.toCharArray();
       char [] b =word2.toCharArray();
  StringBuilder c =new StringBuilder();
  int i=0,j=0,k=0;
  while(i<a.length && j<b.length){
    c.append(a[i++]);
    c.append(b[j++]);
  }
  while(i<a.length){
    c.append(a[i++]);
  }
  while(j<b.length){
    c.append(b[j++]);
  }
return c.toString();
    }
}