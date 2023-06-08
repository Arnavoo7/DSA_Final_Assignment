/*
Given an integer n, return true if it is a power of two. Otherwise, return false. An integer `n` is a power of two,
if there exists an integer `x` such that `n == 2x`.
*/

import java.util.Scanner;


public class One {

    public static boolean isPowerOfTwo(int n){

        //Edge case 1: If n is negative or equal to 0
        if(n<=0)
            return false;
        //Edge case 2: If n is 1 which means either n=1 or by completely dividing n we get to 1
        if(n==1)
            return true;
        //Recursive function condition
        if(n%2==0)
            return isPowerOfTwo(n/2);
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        //Calling
        System.out.println("Output: "+ One.isPowerOfTwo(n));

    }
}