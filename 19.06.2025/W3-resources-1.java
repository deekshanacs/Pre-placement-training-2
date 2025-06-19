import java.util.Scanner;
public class LastWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine().trim(); 
        if (input.isEmpty()) {
            System.out.println("Length of last word: 0");
            return;
        }
        String[] words = input.split("\\s+"); 
        String lastWord = words[words.length - 1];
        System.out.println("Length of last word: " + lastWord.length());
    }
}
