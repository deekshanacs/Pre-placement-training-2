import java.util.*;

public class RearrangeLettersAndSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        StringBuilder letters = new StringBuilder();
        int digitSum = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitSum += ch - '0';  
            } else if (Character.isUpperCase(ch)) {
                letters.append(ch);
            }
        }
        char[] letterArray = letters.toString().toCharArray();
        Arrays.sort(letterArray);

        String result = new String(letterArray) + (digitSum > 0 ? digitSum : "");
        System.out.println("Output: " + result);
    }
}
