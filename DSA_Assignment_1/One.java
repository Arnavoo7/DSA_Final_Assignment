import java.util.Arrays;
import java.util.HashMap;


public class One {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        One o = new One();
        System.out.println(Arrays.toString(o.twoSum(nums,target)));
    }

    public int[] twoSum(int[] nums, int target)
    {

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            //storing value in the num
            int num = nums[i];
            //This will get us the key which is actually holding the elements
            int diff = target - num;

            if( h.containsKey(diff) )
            {
                //Then return previous value and current index as 2 values
                return new int[] {h.get(diff), i};
            }
            else
                h.put(num,i);

        }

        //If not found then return empty array
        return new int[] {};
    }
}