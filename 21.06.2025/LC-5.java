class MatrixFibonacci {
    static int fib(int n) {
        int[][] F = {{1,1},{1,0}};
        if (n == 0) return 0;
        power(F, n - 1);
        return F[0][0];
    }
    static void power(int[][] F, int n) {
        int[][] M = {{1,1},{1,0}};
        for (int i = 2; i <= n; i++) multiply(F, M);
    }
    static void multiply(int[][] F, int[][] M) {
        int x = F[0][0]*M[0][0] + F[0][1]*M[1][0];
        int y = F[0][0]*M[0][1] + F[0][1]*M[1][1];
        int z = F[1][0]*M[0][0] + F[1][1]*M[1][0];
        int w = F[1][0]*M[0][1] + F[1][1]*M[1][1];
        F[0][0] = x; F[0][1] = y;
        F[1][0] = z; F[1][1] = w;
    }
    public static void main(String[] args) {
        System.out.println("F(10) = " + fib(10));
    }
}
