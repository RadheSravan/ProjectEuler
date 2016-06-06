// This program calculates the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum

class Problem6 {

    public static void main(String args[]) {

        int n = 100;
        long difference = 0;

        difference = (sumofNNumbers(n) * sumofNNumbers(n)) - sumOfSquaresOfNNumbers(n);

        System.out.println("\nThe difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " + difference + "\n");
    }

    static long sumofNNumbers(int n) {

        return n * (n + 1) / 2;
    }

    static long sumOfSquaresOfNNumbers(int n) {

        return (n * (n + 1) * ((2 * n) + 1)) / 6;
    }

}
