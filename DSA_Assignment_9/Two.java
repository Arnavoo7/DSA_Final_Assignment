//Given a number n, find the sum of the first natural numbers.

import java.util.Scanner;

public class Two {

    //recursive function
    public static int sum(int n){

        //Base termination condition
        if(n==1)
            return n;
        else
            return ( n+sum(n-1) );

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Output: "+ Two.sum(n));

    }
}
