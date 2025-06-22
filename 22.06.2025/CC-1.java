import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 

        for (int i = 0; i < N; i++) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();

            Arrays.sort(arr); 
            System.out.println(arr[1]); 
        }

        scanner.close();
    }
}
