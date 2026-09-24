class Solution {
    public int sumOfPrimesInRange(int n) {
         int sum=0,f=n,rev=0;
         while(f>0){
            int temp=f%10;
             rev=rev*10+temp;
             f=f/10;
         }
         if(n>rev){
            int temp=n;
            n=rev;
            rev=temp;  
         }
         for(int i=n;i<=rev;i++){
            if(isprime(i)){
                sum+=i;
            }
         }
         return sum;
    }
    static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}