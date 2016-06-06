// This program finds the sum of all the multiples of 3 or 5 below 1000.

class Problem1 {

    public static void main(String args[]) {

        int factor1 = 3;
        int factor2 = 5;

        int start = 1;
        int end = 1000;

        int sum = 0;

        for (int i = start; i < end; i++) {

            if (i % factor1 == 0 || i % factor2 == 0) {
                sum += i;
            }
        }

        System.out.format("\nSum of multiples of %d and %d below %d is %d\n\n", factor1, factor2, end, sum);
    }

}
