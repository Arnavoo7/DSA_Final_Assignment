/*
Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series,
The task is to find Nth term of the series.
*/


public class Six {
    public static int findNthTerm(int a, int d, int N) {
        //Base Termination condition
        if (N == 1) {
            return a;
        } else {
            return findNthTerm(a + d, d, N - 1);
        }
    }

    public static void main(String[] args) {

        int a = 5; // First term
        int d = 2; // Common difference
        int N = 10; // Desired term

        int nthTerm = findNthTerm(a, d, N);
        System.out.println("Nth term: " + nthTerm);
    }
}



