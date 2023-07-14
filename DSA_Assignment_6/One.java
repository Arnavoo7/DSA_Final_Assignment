import java.util.Arrays;

class One {
    public static void main(String[] args){

        String s = "IDID";
        int n = s.length();
        int low = 0;
        int high = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ans[i] = s.charAt(i) == 'I' ? low++ : high--;
        }
        ans[n] = low;

        System.out.println(Arrays.toString(ans));
    }
}
