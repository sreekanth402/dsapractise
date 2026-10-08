class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set <Integer> p=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(p.contains(nums[i])) return true;
        p.add(nums[i]);
        if(p.size()>k){
            p.remove(nums[i-k]);
        }
    }
    return false;
    }
}