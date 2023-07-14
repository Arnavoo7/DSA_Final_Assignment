class Fifth {
    public static void main(String[] args) {

        String s = "abcdefg";
        int k =2;

        if (s == null || s.length() == 0 || k == 0) {
            System.out.println("");
        }

        int i = 0;

        StringBuilder sb = new StringBuilder(s);
        while (i < s.length()) {
            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);
            while (left < right) {
                char a = sb.charAt(left);
                char b = sb.charAt(right);
                sb.setCharAt(left, b);
                sb.setCharAt(right, a);
                left ++;
                right --;
            }
            i = i + 2 * k;
        }

        System.out.println(sb.toString());
    }
}