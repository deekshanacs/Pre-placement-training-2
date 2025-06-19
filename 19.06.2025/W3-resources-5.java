import java.util.Scanner;

public class SubsetSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long sumOfElements = (long) n * (n + 1) / 2;
        long numberOfSubsets = 1L << (n - 1); 

        long totalSum = sumOfElements * numberOfSubsets;

        System.out.println("Sum of elements from all subsets: " + totalSum);
    }
}
