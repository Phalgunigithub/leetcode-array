class Solution {
    public int maxSubArray(int[] nums) {
        
        // Initialize variables
        int n = nums.length;
        int max = Integer.MIN_VALUE;  // Initialize max to a very small value
        int sum = 0;  // Initialize sum to 0
        
        
         // Iterate through the array
        for (int i = 0; i < n; i++) {
            
             sum += nums[i];  // Add the current element to the sum
            max = Math.max(sum, max);  // Update max with the maximum of sum and max
            
            // If sum becomes negative, reset it to 0
            if (sum < 0) {
                sum = 0;
            }
        }
        
        // Return the maximum subarray sum
        return max;
    }
        
    
}