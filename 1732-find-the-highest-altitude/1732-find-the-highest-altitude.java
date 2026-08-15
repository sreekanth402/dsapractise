class Solution {
    public int largestAltitude(int[] gain) {
        int maxalt =0;
        int [] arr =new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<=gain.length;i++){
         arr[i]=arr[i-1]+gain[i-1];
         maxalt=Math.max(maxalt,arr[i]);
        }
        return maxalt; 
    }
}