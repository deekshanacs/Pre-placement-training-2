import java.util.Scanner;

public class InchToMeterConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inch is " + meters + " meters");
    }
}
