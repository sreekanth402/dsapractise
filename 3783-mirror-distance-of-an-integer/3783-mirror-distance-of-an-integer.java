class Solution {
    public int mirrorDistance(int n) {
        int r=0;
        int t =n;
        while(n!=0){
            int digit=n%10;
            r=r*10+digit;
            n/=10;
        }
        return Math.abs(t-r);
    }
}