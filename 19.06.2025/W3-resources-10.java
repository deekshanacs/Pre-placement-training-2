import java.util.Scanner;

public class ParallelLinesCheck {

    public static boolean areParallel(int x1, int y1, int x2, int y2,
                                      int x3, int y3, int x4, int y4) {

        int slopePQ_Y = y2 - y1;
        int slopePQ_X = x2 - x1;
        int slopeRS_Y = y4 - y3;
        int slopeRS_X = x4 - x3;

        return (slopePQ_Y * slopeRS_X) == (slopeRS_Y * slopePQ_X);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for point P (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates for point Q (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates for point R (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Enter coordinates for point S (x4 y4):");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        boolean result = areParallel(x1, y1, x2, y2, x3, y3, x4, y4);

        if (result) {
            System.out.println("The lines PQ and RS are parallel.");
        } else {
            System.out.println("The lines PQ and RS are NOT parallel.");
        }
    }
}
