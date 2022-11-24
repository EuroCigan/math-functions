public class Factorial {
    public static void main(String[] args) {

        int f = 6;
        int n = 6;
        for(int i = 1;i < n;i++){
            f = f * i;
        }
        System.out.println(f);

        System.out.println(powerOfNumber(2,4));


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
            num *= powerOfNumber(num, power - 1 );
        }

        return num;
    }
}
