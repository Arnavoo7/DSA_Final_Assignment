class Third {
    public static void main(String[] args) {
        int[] arr = {2, 1};

        if (arr.length < 3) {
            System.out.println(false);
            return;
        }

        int topidx = 0;
        int top = 0;

        // Find max value and its index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > top) {
                top = arr[i];
                topidx = i;
            }
        }

        // Check if the array is a perfect mountain or not
        int i = 0;
        boolean isValidMountain = true;
        while (i < topidx) {
            if (arr[i] >= arr[i + 1]) {
                isValidMountain = false;
                break;
            }
            i++;
        }

        while (topidx < arr.length - 1) {
            if (arr[topidx] <= arr[topidx + 1]) {
                isValidMountain = false;
                break;
            }
            topidx++;
        }

        System.out.println(isValidMountain);
    }
}
