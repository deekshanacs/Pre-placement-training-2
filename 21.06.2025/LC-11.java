class LagrangeInterpolation {
    public static double interpolate(double[] x, double[] y, double xp) {
        double yp = 0;
        for (int i = 0; i < x.length; i++) {
            double p = 1;
            for (int j = 0; j < x.length; j++) {
                if (j != i)
                    p *= (xp - x[j]) / (x[i] - x[j]);
            }
            yp += p * y[i];
        }
        return yp;
    }
    public static void main(String[] args) {
        double[] x = {0, 1, 2};
        double[] y = {1, 3, 2};
        System.out.println("Interpolated value at x=1.5: " + interpolate(x, y, 1.5));
    }
}
