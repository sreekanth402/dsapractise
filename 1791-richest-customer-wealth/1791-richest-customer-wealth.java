class Solution {
    public int maximumWealth(int[][] accounts) {
    //     int sum=0;
    //    for(int i=0;i<accounts.length;i++){
    //     int value=0;
    //     for(int j=0;j<accounts[i].length;j++){
    //       value+=accounts[i][j];
    //       sum=Math.max(sum,value);
    //     }
    //    }
    //    return sum;
    // }

    int sum=0;
    for(int [] rows:accounts){
        int value=0;
        for(int b:rows){
            value+=b;
            sum=Math.max(sum,value);
        }
    }
    return sum;

}
}