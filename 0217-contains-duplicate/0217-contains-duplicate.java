class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> s =new HashSet<>();
       for(int a:nums){
        s.add(a);
       }
       return nums.length!=s.size();
    }
}