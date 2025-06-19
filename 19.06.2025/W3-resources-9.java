import java.util.Scanner;

public class DebtCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of months (n): ");
        int n = sc.nextInt();

        int debt = 100000; 

        for (int i = 1; i <= n; i++) {
   
            double interest = debt * 0.04;
            double newAmount = debt + interest;

            debt = (int) (Math.round(newAmount / 1000.0) * 1000);
        }

        System.out.println("Debt after " + n + " months: $" + debt);
    }
}
