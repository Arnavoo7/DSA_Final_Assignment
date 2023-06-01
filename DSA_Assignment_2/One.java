import java.util.Arrays;

public class One {
    public static void main(String[] args) {

        int[] nums = {1, 4, 3, 2};
        int maxSum = 0;

        //Sorting list in ascending order
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        System.out.println("So the maximum possible sum is: "+maxSum);
    }
}




