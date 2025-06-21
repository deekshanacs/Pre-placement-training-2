class GradientDescent {
    public static void main(String[] args) {
        double x = 0, alpha = 0.1;
        for (int i = 0; i < 100; i++) {
            double grad = 2 * (x - 3);
            x = x - alpha * grad;
        }
        System.out.println("Minimum at x = " + x);
    }
}
