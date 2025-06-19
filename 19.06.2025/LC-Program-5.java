import java.util.Scanner;

public class CountAndSaySequence {

    public static String countAndSay(int n) {
        if (n <= 0) return "";

        String result = "1";

        for (int i = 1; i < n; i++) {
            result = buildNext(result);
        }

        return result;
    }

    private static String buildNext(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char prevChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                sb.append(count).append(prevChar);
                count = 1;
                prevChar = currentChar;
            }
        }

        sb.append(count).append(prevChar);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        String result = countAndSay(n);
        System.out.println("Count-and-say term " + n + ": " + result);
    }
}
