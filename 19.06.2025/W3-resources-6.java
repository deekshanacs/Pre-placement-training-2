import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int a = sc.nextInt();

        System.out.print("Enter side 2: ");
        int b = sc.nextInt();

        System.out.print("Enter side 3: ");
        int c = sc.nextInt();

        if (isTriangle(a, b, c)) {
            System.out.println("Yes, the given sides can form a triangle.");
        } else {
            System.out.println("No, the given sides cannot form a triangle.");
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}
