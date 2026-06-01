class Solution {
    public int minimumCost(int[] cost) {
        int total =0 ,count=1;
        Arrays.sort(cost);     
       for(int i=cost.length-1;i>=0;i--){
            if(count%3!=0){
                total+=cost[i];
            }
            count++;
        }
        return total ;
    }
}