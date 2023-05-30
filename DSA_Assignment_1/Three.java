public class Three {

        public int search(int[] nums, int target) {
            //o(log n) and o(1)
            int low = 0, high = nums.length;
            while(low < high) {
                int mid = low + (high - low)/2;
                if(target > nums[mid])
                    low = mid + 1;
                else
                    high = mid;
            }
            return low;
        }


    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 5;

        Three t3 = new Three();
        System.out.println("Index is: "+t3.search(arr,target));


    }
}
