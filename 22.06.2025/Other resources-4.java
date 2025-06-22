import java.util.Scanner;

public class WaterRefill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();  
            int Y = sc.nextInt(); 

            int refills = (int) Math.ceil((double) X / Y);
            System.out.println(refills);
        }

        sc.close();
    }
}
