import java.util.Arrays;

class Seven {
    public int[] zeroes(int[] nums) {
        //Do not return anything, modify nums in-place instead.
        int l = 0;
        for(int r = 0; r < nums.length; r++)
            if(nums[r] != 0) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l += 1;
            }

        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        Seven s7 = new Seven();
        System.out.println(Arrays.toString(s7.zeroes(arr)));
    }
}
