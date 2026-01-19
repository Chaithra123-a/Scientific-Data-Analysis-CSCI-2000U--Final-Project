public class Factorial {

    // 5A1 Method to calculate factorial using a for loop
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("0! = " + factorial(0));  // 1
        System.out.println("1! = " + factorial(1));  // 1
        System.out.println("5! = " + factorial(5));  // 120
        System.out.println("10! = " + factorial(10)); // 3628800
    }
}