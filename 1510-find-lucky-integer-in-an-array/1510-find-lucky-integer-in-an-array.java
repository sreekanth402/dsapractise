class Solution {
    public int findLucky(int[] arr) {
         HashMap<Integer,Integer> freq =new HashMap<>();
          for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
          }
          int ans=-1;
          for(Map.Entry<Integer,Integer> f:freq.entrySet()){
            int k =f.getKey();
            int b =f.getValue();
            if(k==b){
                ans=Math.max(k,ans);
            }
          }
          return ans;
    }
}