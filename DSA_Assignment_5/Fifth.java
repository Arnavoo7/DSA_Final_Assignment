import java.util.*;
import java.lang.*;

class Fifth
{
    public static void main(String[] args) {

        int[] arr1 = {4,5,8}, arr2 = {10,9,1,8};
        int d = 2;

        Arrays.sort(arr2);
        int ans = 0;
        for (int i= 0;i<arr1.length;i++) {
            int it = Arrays.binarySearch(arr2, 0, arr2.length, arr1[i]);
            if (it < 0) it = -(it+1);
            boolean isIt = false;
            if(it<arr2.length && Math.abs(arr2[it] - arr1[i]) <= d)isIt = true;
            if(it != 0 && Math.abs(arr2[it-1] - arr1[i]) <= d)isIt = true;
            if(!isIt)
                ans++;
        }
        System.out.println(ans);
    }

}