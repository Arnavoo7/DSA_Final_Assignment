import java.util.*;

class Two {
    public static int[] findNearestSmallerNumber(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate the array from left to right
        for (int i = 0; i < n; i++) {
            // Remove elements from stack that are greater than or equal to current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no smaller element on the left
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 5};
        int[] nearestSmaller = findNearestSmallerNumber(arr);

        for (int i = 0; i < nearestSmaller.length; i++) {
            System.out.print(nearestSmaller[i] + " ");
        }
    }
}


