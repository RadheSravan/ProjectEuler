// This program calculates the largest palindrome made from the product of two 3-digit numbers.

class Problem4 {

    public static void main(String args[]) {

        long maxPalindrome = 101;
        long product = 1;

        for (int i = 101; i < 1000; i++) {

            for (int j = 101; j < 1000; j++) {

                if (i % 100 != 0 && j % 100 != 0) {

                    product = i * j;

                    if (isPalindrome(product) == 1 && product > maxPalindrome)
                        maxPalindrome = product;

                }
            }
        }

        System.out.println("\nThe largest palindrome made from the product of two 3-digit numbers is " + maxPalindrome + "\n");

    }

    static int isPalindrome(long n) {

        long originalNumber = n;
        long reversedNumber = 0;
        long temp = 0;

        while (originalNumber > 0) {

            temp = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + temp;
            originalNumber = originalNumber / 10;

        }

        if (reversedNumber == n)
            return 1;
        else
            return 0;

    }
}
