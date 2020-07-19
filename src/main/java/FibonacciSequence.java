public class FibonacciSequence {
    public int getFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
        }
    }
}
