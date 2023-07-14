class One {
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4};
        int m = 2, n = 2;

        if (original.length != m * n) {
            System.out.println("Cannot create the matrix.");
            return;
        }

        int[][] ans = new int[m][n];

        for (int i = 0; i < original.length; ++i)
            ans[i / n][i % n] = original[i];

        // Print the ans array in a tabular format
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
