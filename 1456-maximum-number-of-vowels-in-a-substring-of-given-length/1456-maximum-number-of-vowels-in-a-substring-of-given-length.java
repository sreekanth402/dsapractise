class Solution {
    public int maxVowels(String s, int k) {
        int left=0 ,vowels=0,max=0;
        for(int right=0;right<s.length();right++){
            if(isvowels(s.charAt(right))) vowels++;
            if(right-left+1==k){
                max=Math.max(vowels,max);
                if(isvowels(s.charAt(left))) vowels--;
                left++;
            }
            
            
        }
        return max;
    }

        private boolean isvowels(char ch){
            return ch=='a' ||
            ch=='e' ||
            ch=='i' ||
            ch=='o' ||
            ch=='u';
        }
        
    }
