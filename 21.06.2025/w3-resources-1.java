class MonteCarloPi {
    public static void main(String[] args) {
        int inside = 0, total = 1000000;
        for (int i = 0; i < total; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) inside++;
        }
        double pi = 4.0 * inside / total;
        System.out.println("Estimated Pi: " + pi);
    }
}
