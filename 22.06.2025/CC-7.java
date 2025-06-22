import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();  
        while (T-- > 0) {
            int A = scanner.nextInt();  

            if (A % 2 == 0 && A % 7 == 0) {
                System.out.println("Alice");
            } else if (A % 2 != 0 && A % 9 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }

        scanner.close();
    }
}
