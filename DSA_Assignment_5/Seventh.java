class Seventh {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (l == r || nums[l] < nums[r]) {
                System.out.println(nums[l]);
                break;
            }

            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
    }
}
