class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count =0;
        for(String o:operations){
            switch(o){
                case "X++": count++; break;
                case "++X": count++; break;
                case "--X": count--; break;
                case "X--": count--;break;
            }
        }
        return count;
    }
}