import java.util.HashMap;
import java.util.Map;

class Fourth {
    public static void main(String[] args) {

        int[] nums = {0,1};
        if (nums == null || nums.length == 0) { // Base Case
            System.out.println(0);
        }
        // Converting all 0 to -1
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0; // current
        int max = 0; // final-ans
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // put reference in the starting of 0 & -1
        for(int i = 0; i < nums.length; i++){
            sum += nums[i]; // cumulative sum
            if(map.containsKey(sum)){ // if cumulative sum key :- 0, -1, 1 already present
                int last = map.get(sum); // we get it's value
                max = Math.max(max, i - last); // and update max
            }
            else{ // if it's not present then create it's key-value pair
                map.put(sum, i);
            }
        }

        System.out.println(max); // finally return it
    }
}