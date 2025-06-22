import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  
        while (T-- > 0) {
            int X = scanner.nextInt();  
            int Y = scanner.nextInt();  

            int amount = 0;

            if (Y <= X) {
                amount = Y; 
            } else {
                amount = X + (Y - X) * 2;  
            }

            System.out.println(amount);
        }

        scanner.close();
    }
}
