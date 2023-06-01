public class Eight {

    public static void main(String[] args) {

        int[] nums = {1};
        int k = 0;
        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; ++i) {
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }

        int ans = max - min - 2 * k;

        System.out.println("Output is: "+ (ans > 0 ? ans : 0));
    }
}
