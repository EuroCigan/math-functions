public class Recursion {
    public static void main(String[] args) {
        System.out.println(powerOfNumber(9,3));


        System.out.println("Factorial res: " + factorial(5));
        System.out.println("Factorial res: " + factorial(6));
    }
        // Example of calculating factorial using recursion
        private static int factorial(int n) {
            if (n != 1) {
                n *= factorial(n - 1);
            }

            return n;
        }

        private static int powerOfNumber(int num, int power) {
            if (power != 1) {
                num *= powerOfNumber(num, power - 1);
            }

            return num;


        }
}
