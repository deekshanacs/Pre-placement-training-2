class RungeKutta {
    static double f(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        double x0 = 0, y = 1, h = 0.1;
        for (int i = 0; i < 10; i++) {
            double k1 = h * f(x0, y);
            double k2 = h * f(x0 + h / 2, y + k1 / 2);
            double k3 = h * f(x0 + h / 2, y + k2 / 2);
            double k4 = h * f(x0 + h, y + k3);
            y = y + (k1 + 2*k2 + 2*k3 + k4) / 6;
            x0 = x0 + h;
        }
        System.out.println("y(1) ≈ " + y);
    }
}
