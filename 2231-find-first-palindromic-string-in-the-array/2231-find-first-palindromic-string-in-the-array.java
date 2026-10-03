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
           int i=0,j=s.length()-1;
           while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
           }
           
           return true;
        }
    }
