class Second {
    public static int maxSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int currentMax = nums[0];
        int n = nums.length;

        // Find the maximum subarray sum without circular wrapping
        for (int i = 1; i < n; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }

        int totalSum = 0;
        int minSum = nums[0];
        int currentMin = nums[0];

        // Find the total sum and the minimum subarray sum with circular wrapping
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        // If the total sum is equal to the minimum subarray sum (all negative elements), return the maximum subarray sum without circular wrapping
        if (totalSum == minSum) {
            return maxSum;
        }

        // Otherwise, return the maximum of the maximum subarray sum without circular wrapping and the (total sum - minimum subarray sum) with circular wrapping
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5,-3,5};
        int maxSum = maxSubarraySum(nums);
        System.out.println("Maximum circular subarray sum: " + maxSum);
    }
}