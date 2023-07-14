class Fourth{
    public static void main(String[] args) {

        Fourth f = new Fourth();
        String s = "Let's take LeetCode contest";
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String x : arr) {
            sb.append(f.reverse(x)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    public String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char arr[] = s.toCharArray();
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}