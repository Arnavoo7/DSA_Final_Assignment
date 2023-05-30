import java.util.Arrays;

class Eight {
    public int[] findError(int[] nums) {
        int N = nums.length, sum = N * (N + 1) / 2;
        int[] ans = new int[2];
        boolean[] seen = new boolean[N+1];
        for (int num : nums) {
            sum -= num;
            if (seen[num]) ans[0] = num;
            seen[num] = true;
        }
        ans[1] = sum + ans[0];

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,4};

        Eight e8 = new Eight();
        System.out.println(Arrays.toString(e8.findError(arr)));
    }


}