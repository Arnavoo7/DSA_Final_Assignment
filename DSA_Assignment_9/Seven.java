//Given a string S, the task is to write a program to print all permutations of a given string.


import java.util.*;

public class Seven {
    public static void printPermutations(String str) {
        // Convert the string to a character array for easier manipulation
        char[] arr = str.toCharArray();

        // Create a list to store permutations
        List<String> permutations = new ArrayList<>();

        // Call the recursive helper function to generate permutations
        generatePermutations(arr, 0, permutations);

        // Print the generated permutations
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(char[] arr, int index, List<String> permutations) {
        if (index == arr.length - 1) {
            // Reached the end of the string, add the current permutation to the list
            permutations.add(String.valueOf(arr));
        } else {
            // Generate permutations by swapping characters at different positions
            for (int i = index; i < arr.length; i++) {
                // Swap characters
                swap(arr, index, i);

                // Recursively generate permutations for the remaining string
                generatePermutations(arr, index + 1, permutations);

                // Restore the original order by swapping back
                swap(arr, index, i);
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of the string:");
        printPermutations(str);
    }
}
