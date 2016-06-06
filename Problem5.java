// This program calculates the smallest positive number that is evenly divisible by all of the numbers from 1 to 20

class Problem5 {

    public static void main(String args[]) {

        long leastMultiple = 1;
        for (int i = 11; i <= 20; i++) {

            leastMultiple = lcm(i, leastMultiple);
        }
        System.out.println("\nThe smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + leastMultiple + "\n");
    }

    static long gcd(long firstNumber, long secondNumber) {

        if (secondNumber == 0) {
            return firstNumber;
        }
        return gcd(secondNumber, firstNumber % secondNumber);

    }

    static long lcm(long firstNumber, long secondNumber) {
        return (firstNumber * secondNumber) / gcd(firstNumber, secondNumber);
    }
}
