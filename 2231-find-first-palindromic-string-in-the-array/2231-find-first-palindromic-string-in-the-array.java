public class Solution {
    public static String firstPalindrome(String[] words) {
        // for (String word : words) {
        //     StringBuilder reversed = new StringBuilder(word).reverse();
        //     if (word.equals(reversed.toString())) {
        //         return word;
        //     }
        // }
        // return "";  
         for( String s:words){
            if(pal(s)){
                return s;
            }
         }
         return "";
    }
        static boolean pal(String s){
            StringBuilder b= new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                b.append(s.charAt(i));
            }
            return s.equals(b.toString());
        }
    }
