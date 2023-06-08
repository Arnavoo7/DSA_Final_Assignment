//Given an array of integers arr, the task is to find maximum element of that array using recursion.

class Five {

        public static int findMax(int[] arr, int i) {

            //returns the Integer min value: -2147483648 for comparing at last with the current element
            if (i >= arr.length) {
                return Integer.MIN_VALUE; // return the minimum possible value if the index is out of bounds
            }

            //In each call holding the current element
            int currentElement = arr[i];
            //recursive call till equal to arr.length
            int maxSoFar = findMax(arr, i + 1);

            //Comparing and returning
            return Math.max(currentElement, maxSoFar);
        }

        public static void main(String[] args) {
            int[] arr = {1, 4, 45, 6, 10, -8};
            int maxElement = Five.findMax(arr, 0);

            System.out.println("Maximum element: " + maxElement);
        }


}
