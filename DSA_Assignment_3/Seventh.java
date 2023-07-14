import java.util.ArrayList;
import java.util.List;

class Seventh{
    public static void main(String[] args) {

        Seventh s = new Seventh();

        int[] nums ={0,1,3,50,75};
        int n = nums.length, lower = 0, upper = 99;
        List<String> ans = new ArrayList<>();

        if (n == 0) {
            ans.add(s.f(lower, upper));
            System.out.println(ans);
        }
        if (nums[0] > lower) {
            ans.add(s.f(lower, nums[0] - 1));
        }
        for (int i = 1; i < n; ++i) {
            int a = nums[i - 1], b = nums[i];
            if (b - a > 1) {
                ans.add(s.f(a + 1, b - 1));
            }
        }
        if (nums[n - 1] < upper) {
            ans.add(s.f(nums[n - 1] + 1, upper));
        }
        System.out.println(ans);
    }

    private String f(int a, int b) {
        return a == b ? a + " " : a + "->" + b;
    }
}