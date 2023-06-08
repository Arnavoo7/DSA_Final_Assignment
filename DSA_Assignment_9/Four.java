//Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

import java.util.Scanner;

public class Four {

    public static int calcExponent(int base, int power){

        /*
        working:
        ________
        base = 2, power = 3
        2 * func(2, 3-1)
        2 * func(2, 2-1)
        2 * func(2, 1-1)  as the power reaches 0 base termination condition is triggered and we return 1
         */

        //Base Termination condition
        if(power == 0)
            return 1;

        return ( base * calcExponent(base, power - 1) );

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(base): ");
        int b = sc.nextInt();
        System.out.print("Enter exponent(power): ");
        int p = sc.nextInt();

        System.out.println("Output: " + Four.calcExponent(b,p));
    }
}
