class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e =0 ,o =0;
        int c=n+n;
        for(int i=1;i<=c;i++){
         if(i%2==0){
            e+=i;
         }
         else{
            o+=i;
         }
        }
        while(o!=0){
            int temp=o;
            o=e%o;
            e=temp;
        }
        return e;
    }
}