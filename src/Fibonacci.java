public class Fibonacci {

    private static int previous = 0;
    private static int current;
    private static int nextOne;

    public static void fibonacciFor() {

        for (current = 1; current < 100; current = nextOne) {
            nextOne = previous + current;
            System.out.print(current + " ");
            previous = current;
        }
    }
}
