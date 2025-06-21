class HornerEval {
    public static double evaluate(double[] coeffs, double x) {
        double result = coeffs[0];
        for (int i = 1; i < coeffs.length; i++)
            result = result * x + coeffs[i];
        return result;
    }
    public static void main(String[] args) {
        double[] poly = {1, -3, 2}; // x^2 - 3x + 2
        System.out.println("Value at x=2: " + evaluate(poly, 2));
    }
}
