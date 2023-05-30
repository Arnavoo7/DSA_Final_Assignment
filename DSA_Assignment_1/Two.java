public class Two {

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int boundary = nums.length - 1;
        int i = 0;
        while (i <= boundary) {
            if (nums[i] == val) {
                swap(nums, i, boundary);
                boundary -= 1;
            } else {
                i += 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] arr ={3,2,2,3};
        int value = 3;

        Two t = new Two();
        System.out.println("The length of array nums is: "+t.removeElement(arr,value));

    }
}
