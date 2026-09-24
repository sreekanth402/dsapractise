class Solution {
    public int sumOfPrimesInRange(int n) {
         int sum=0,f=n,rev=0;
         while(f>0){
            int temp=f%10;
             rev=rev*10+temp;
             f=f/10;
         }
         if(n<rev){
         for(int i=n;i<=rev;i++){
            if(isprime(i)){
                sum+=i;
            }
         }
         }
         else{
             for(int i=rev;i<=n;i++){
            if(isprime(i)){
                sum+=i;
            }
         }
    }
      return sum;
    }
    boolean isprime(int n){
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