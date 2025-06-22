import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();  

        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            if (A != B && B != C && A != C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
