public class Activity1 {
    static double pow(double x, int n) {
        return Math.pow(x, n);
    }
    static double delta(int a, int b, int c) {
        return pow(b, 2) - 4 * a * c;
    }
    public static void main(String[] args) {
        double res = delta(1,5,1);
        System.out.println(res);
    }
}
