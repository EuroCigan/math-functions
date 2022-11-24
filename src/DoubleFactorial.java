public class DoubleFactorial {
    public static void main(String[] args) {

        System.out.println("Factorial res: " + factorialFor(5));
        System.out.println("Factorial res: " + factorialFor(6));
    }

    private static int factorialFor(int num) {
        int res = 1;
        int k;
        if (num % 2 == 0) {
            k = 0;
        } else {
            k = 1;
        }
        for (int i = 1; i <= num; i++) {
                if (i % 2 == k) {
                    res = res * i;

            }
        }
        return res;
    }

}