import java.util.Arrays;

class Eighth {
    public static void main(String[] args) {

        int j=0, n=3;
        int[] nums = {2,5,1,3,4,7};
        int[] ans = new int[2*n];
        for(int i=0; i<2*n; i=i+2){
            ans[i] = nums[j];
            ans[i+1] = nums[n+j];
            j++;
        }

        System.out.println(Arrays.toString(ans));
    }
}