class TrapezoidalRule {
    public static double f(double x) {
        return x * x;
    }

    public static void main(String[] args) {
        int n = 10;
        double a = 0, b = 1;
        double h = (b - a) / n;
        double sum = f(a) + f(b);
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += 2 * f(x);
        }
        double result = (h / 2) * sum;
        System.out.println("Trapezoidal Integration: " + result);
    }
}
