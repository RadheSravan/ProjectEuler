// This program calculates the Sum of even-valued terms in the Fibonacci sequence.
// Note : As mentioned in the problem statement it is assumed that the first two terms of the sequence are 1 and 2 respectively.

class Problem2 {

    public static void main(String args[]) {

        long i = 1;
        long limit = 4000000;
        long sum = 0;

        while (fibonacci(i) <= limit) {
            if (fibonacci(i) % 2 == 0)
                sum += fibonacci(i);
            i++;
        }

        System.out.format("\nSum of even-valued terms in the Fibonacci sequence whose values do not exceed %d is : %d\n\n", limit, sum);

    }

    static long fibonacci(long n) {
        long firstNumber = 1, secondNumber = 2, nextNumber = 0, i;

        for (i = 0; i < n; i++) {

            if (i == 0)
                nextNumber = 1;
            else if (i == 1)
                nextNumber = 2;
            else {
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }

        }
        return nextNumber;

    }

}
