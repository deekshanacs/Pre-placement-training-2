import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        while (T-- > 0) {
            int N = scanner.nextInt(); 
            int sum = 0;

            while (N > 0) {
                sum += N % 10; 
                N = N / 10;    
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}
