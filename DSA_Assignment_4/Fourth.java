import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        int[] nums = {1,4,3,2};

        Arrays.sort(nums);
        int len = nums.length;
        int result = 0;
        for (int i = 0; i < len - 1; i += 2) {
            result += nums[i];
        }

        System.out.println(result);
    }
}