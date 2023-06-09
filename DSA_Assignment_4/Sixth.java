import java.util.Arrays;

class Sixth {

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};
        int[] result = new int[nums.length];

        int right = nums.length - 1;
        int left = 0;
        int resultIndex = result.length - 1;
        while (left <= right) {

            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                result[resultIndex] = nums[left] * nums[left];
                left++;
            } else {
                result[resultIndex] = nums[right] * nums[right];
                right--;
            }
            resultIndex--;
        }

        System.out.println(Arrays.toString(result));
    }
}