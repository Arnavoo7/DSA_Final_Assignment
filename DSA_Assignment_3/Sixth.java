class Sixth {

    public static void main(String[] args) {

        int[] nums = {2,2,1};

        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) ans ^= nums[i];

        System.out.println(ans);
    }
}
