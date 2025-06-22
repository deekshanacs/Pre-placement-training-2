import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int hours = sc.nextInt();
            int charge = 10;
            if (hours > 2) {
                charge += (hours - 2) * 5;
            }
            System.out.println(charge);
        }

        sc.close();
    }
}
