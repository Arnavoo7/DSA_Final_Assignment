class Fifth{
    public static void main(String[] args) {

        int n = 5;
        int completedRows = 0;
        long left = 1;
        long right = n;
        while (left <= right) {

            int mid = (int) ((left + right) / 2);
            long coins = (long) ((mid / 2.0) * (mid + 1));
            if (coins > n) {
                right = mid - 1;
            } else {
                completedRows = Math.max(completedRows, mid);
                left = mid + 1;
            }

        }

        System.out.println(completedRows);
    }
}