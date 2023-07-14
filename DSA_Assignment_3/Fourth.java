class Fourth {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        //o(log n) and o(1)
        int low = 0, high = nums.length;
        while(low < high) {
            int mid = low + (high - low)/2;
            if(target > nums[mid])
                low = mid + 1;
            else
                high = mid;
        }

        System.out.println(low);
    }
}
