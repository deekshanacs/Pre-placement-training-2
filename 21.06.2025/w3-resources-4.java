class GaussianElimination {
    public static void main(String[] args) {
        double[][] a = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };
        int n = 3;
        for (int i = 0; i < n; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++)
                if (Math.abs(a[j][i]) > Math.abs(a[max][i]))
                    max = j;
            double[] temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            for (int j = i + 1; j < n; j++) {
                double factor = a[j][i] / a[i][i];
                for (int k = i; k <= n; k++)
                    a[j][k] -= factor * a[i][k];
            }
        }
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            x[i] = a[i][n] / a[i][i];
            for (int j = i - 1; j >= 0; j--)
                a[j][n] -= a[j][i] * x[i];
        }
        for (double xi : x) System.out.println("Solution: " + xi);
    }
}
