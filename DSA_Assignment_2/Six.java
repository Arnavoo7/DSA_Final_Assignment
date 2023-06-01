import java.util.Scanner;


public class Six {

    public static void main(String[] args) {

        int i = 0;
        int[] nums = {-1,0,3,5,9,12};
        int j = nums.length - 1;
        int result = -1;
        int mid = 0;



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();



        while (i <= j) {

            mid = (i + j) / 2;
            if (nums[mid] == target)
            {
                result=mid;
                break;
            }
            else if (nums[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }

        if(nums[mid] == target)
            System.out.println("The index where the target is present is: " + result);
        else
            System.out.println("The target is not present: "+result);
    }
}
