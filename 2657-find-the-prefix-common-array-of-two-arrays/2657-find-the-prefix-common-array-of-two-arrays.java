class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] arr =new int[A.length];
        int count=0;
        Set <Integer> j =new HashSet();
        Set <Integer> H =new HashSet();
        for(int i=0;i<A.length;i++){
            j.add(A[i]);
            H.add(B[i]);
            if(H.contains(A[i]))count++;
            if(j.contains(B[i]) && A[i]!=B[i]) count++;
            arr[i]=count;
        }
        return arr;
    }
}