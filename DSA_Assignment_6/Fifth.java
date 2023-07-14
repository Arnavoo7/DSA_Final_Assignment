import java.util.Arrays;

class Fifth {
    public static void main(String[] args) {

        int[] nums1 = {5,3,4,2}, nums2 = {4,2,2,5};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n = nums1.length, res = 0;
        for (int i = 0; i < n; ++i) {
            res += nums1[i] * nums2[n - i - 1];
        }

        System.out.println(res);
    }
}