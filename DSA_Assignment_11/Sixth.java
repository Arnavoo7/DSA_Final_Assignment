class Sixth {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {11,13,15,17};

        Sixth s = new Sixth();
        int minElement = s.findMin(nums);

        System.out.println(minElement);
    }

}

