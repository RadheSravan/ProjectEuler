// This program calculates the largest prime factor of a number

import java.util.HashSet;

class Problem3 {
    public static void main(String args[]) {
        long factor = 2, largestPrimeFactor = 2;
        HashSet < Long > set = new HashSet < Long > ();

        long input;

        long number = input = 600851475143L;

        while (number != 0) {

            if (number % factor != 0) {
                factor = factor + 1;
            } else {
                number = number / factor;
                set.add(factor);

                if (number == 1) {
                    break;
                }
            }
        }

        for (Long primeFactor: set) {

            if (primeFactor > largestPrimeFactor)
                largestPrimeFactor = primeFactor;
        }

        System.out.format("\nThe largest prime factor of the number %d is %d\n\n", input, largestPrimeFactor);

    }
}
