import java.util.HashSet;


class Six {
    public boolean duplicate(int[] nums)
    {
        //loose coupling
        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        Six s6 = new Six();
        System.out.println(s6.duplicate(arr));
    }
}