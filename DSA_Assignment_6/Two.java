class Two {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;

        if (matrix.length == 0) {
            System.out.println(false);
            return;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = rows * columns - 1;  // Update the high index

        while (low <= high) {  // Modify the loop condition
            int mid = low + (high - low) / 2;  // Calculate the mid index

            int value = matrix[mid / columns][mid % columns];  // Calculate the value at the mid index

            if (value == target) {
                System.out.println(true);
                return;
            } else if (value < target) {
                low = mid + 1;  // Update the low index
            } else {
                high = mid - 1;  // Update the high index
            }
        }

        System.out.println(false);
    }
}
