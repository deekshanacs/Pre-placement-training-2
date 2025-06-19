import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sqrt = (int) Math.sqrt(num);

        if (sqrt * sqrt == num) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }
    }
}
