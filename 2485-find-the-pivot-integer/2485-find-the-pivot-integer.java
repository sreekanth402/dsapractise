class Solution {
    public int pivotInteger(int n) {
       if(n==1) return 1;
       int total =n*(n+1)/2;
       for(int i=2;i<=n;i++){
        int sum=i*(i+1)/2;
        int t= i*(i-1)/2;
      if(sum==total-t) return i;
      }
      return -1;
       }
    }
