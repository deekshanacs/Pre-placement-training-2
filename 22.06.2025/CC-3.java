import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  

        while (T-- > 0) {
            int X = scanner.nextInt();  
            int Y = scanner.nextInt();  
            int Z = scanner.nextInt();  

            int totalMoney = (X * 5) + (Y * 10);
            int chocolates = totalMoney / Z;

            System.out.println(chocolates);
        }

        scanner.close();
    }
}
