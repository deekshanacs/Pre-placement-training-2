import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  
        while (T-- > 0) {
            int price = sc.nextInt();
            int age = sc.nextInt();

            if (age < 12 || age > 60) {
                System.out.println(price / 2);
            } else {
                System.out.println(price);
            }
        }
        sc.close();
    }
}
