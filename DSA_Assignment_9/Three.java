//Given a positive integer, N. Find the factorial of N.

import java.util.Scanner;

public class Three {

    public static int fact(int n){

        //Base termination condition
        if(n==1)
            return n;
        else
            return ( n * fact(n-1) );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Output :" + Three.fact(n));

    }
}
