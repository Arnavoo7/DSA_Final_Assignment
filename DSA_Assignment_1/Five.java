import java.util.Arrays;

class Five {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int r1 = m-1;
        int r2 = n-1;

        for(int w = m+n-1; w >= 0; w--) {
            if(r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];
            } else {
                nums1[w] = nums2[r2--];
            }
        }

        return nums1;
    }


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,0,0,0};
        int i=3;
        int[] arr2 = {2,5,6};
        int j=3;

        Five f5 = new Five();
        System.out.println(Arrays.toString(f5.merge(arr1,i,arr2,j)));

    }
}