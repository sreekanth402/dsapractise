import java.util.*;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums); // sort to pick smallest elements first
        int n = nums.length;
        int[] prefix = new int[n];
        
        // build prefix sums
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        int m = queries.length;
        int[] ans = new int[m];
        
        // for each query, find largest prefix <= query
        for (int i = 0; i < m; i++) {
            int q = queries[i];
            int idx = upperBound(prefix, q); 
            ans[i] = idx; // idx is the count of elements we can take
        }
        
        return ans;
    }
    
    // helper: find first index where prefix > target
    private int upperBound(int[] prefix, int target) {
        int left = 0, right = prefix.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // number of elements we can take
    }
}
