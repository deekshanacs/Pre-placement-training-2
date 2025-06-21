import java.math.BigInteger;
class BigFactorial {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    public static void main(String[] args) {
        System.out.println("100! = " + factorial(100));
    }
}
