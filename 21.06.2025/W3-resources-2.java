class EulersMethod {
    public static double f(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        double x0 = 0, y = 1, h = 0.1;
        for (int i = 0; i < 10; i++) {
            y = y + h * f(x0, y);
            x0 = x0 + h;
        }
        System.out.println("Approx y(1): " + y);
    }
}
