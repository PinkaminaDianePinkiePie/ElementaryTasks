public class Fibonacci {

    private static final int FIBONACCI_NUMBERS = 11;
    private static int previous = 0;
    private static int current;
    private static int nextOne;
    private static int massive[] = new int[FIBONACCI_NUMBERS];

    public static void fibonacciFor() {

        for (current = 1; current < 100; current = nextOne) {
            nextOne = previous + current;
            System.out.print(current + " ");
            previous = current;
        }
        System.out.print("\n");
    }
    public static void fibonacciMassiveDoWhile() {
        previous = 0;
        current = 1;
        int count = 0;

        do {
            nextOne = previous + current;
            massive[count] = current;
            previous = current;
            current = nextOne;
            System.out.print(massive[count] + " ");
            count++;
        } while (current < 100);
    }
}
