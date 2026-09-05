class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s =new StringBuilder();
        StringBuilder b =new StringBuilder();
       for(String c:word1){
          s.append(c);
       }
       for(String d :word2){
        b.append(d);
       }
       boolean a = same(s.toString(),b.toString());
       return a;
    }
    public static boolean same(String s ,String b){
        return s.equals(b);
    }
}