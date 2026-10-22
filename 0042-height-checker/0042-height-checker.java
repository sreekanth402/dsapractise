class Solution {
    public int heightChecker(int[] heights) {
        int [] arr =new int[heights.length];
        int in =0,count=0;
        for(int s:heights){
            arr[in]=s;
            in++;
        }
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}