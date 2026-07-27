class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product =1;
        int digits ;
        int result;
        while(n!=0){
         digits =n%10;
         n/=10;
         sum+=digits;
         product*=digits;
        }
        result=product-sum;
        return result;
    }
}