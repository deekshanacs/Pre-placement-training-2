class DFT {
    public static void main(String[] args) {
        int N = 4;
        double[] real = {1, 2, 3, 4};
        double[] imag = new double[N];
        for (int k = 0; k < N; k++) {
            for (int n = 0; n < N; n++) {
                double angle = 2 * Math.PI * k * n / N;
                imag[k] -= real[n] * Math.sin(angle);
                real[k] += real[n] * Math.cos(angle);
            }
            System.out.printf("X[%d] = %.2f + %.2fi\n", k, real[k], imag[k]);
        }
    }
}
