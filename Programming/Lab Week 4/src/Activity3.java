public class Activity3 {
    static int fibonacciSequence(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
    }
    public static void main(String[] args) {
        var res = fibonacciSequence(6);
        System.out.println(res);
    }
}
