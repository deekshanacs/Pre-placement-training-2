class SimpsonsRule {
    public static double f(double x) {
        return 1 / (1 + x * x);
    }

    public static double integrate(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f(a) + f(b);
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += (i % 2 == 0) ? 2 * f(x) : 4 * f(x);
        }
        return (h / 3) * sum;
    }

    public static void main(String[] args) {
        System.out.println("Integration result: " + integrate(0, 1, 6));
    }
}
