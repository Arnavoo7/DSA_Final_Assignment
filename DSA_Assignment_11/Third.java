public class Third{
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = n;

        for (int i = 0; i < n; i++) {
            missing ^= nums[i];
            missing ^= i;
        }

        return missing;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        Third solution = new Third();
        int missingNumber = solution.missingNumber(nums);

        System.out.println(missingNumber);
    }
}

