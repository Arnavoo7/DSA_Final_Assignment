
public class Fourth{

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};

        Fourth f = new Fourth();
        int repeatedNumber = f.findDuplicate(nums);

        System.out.println(repeatedNumber); // Output: 2
    }
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find the meeting point inside the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];

        // Find the start of the cycle
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}