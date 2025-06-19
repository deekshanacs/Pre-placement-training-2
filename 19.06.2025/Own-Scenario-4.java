import java.util.Random;
import java.util.Scanner;

public class BananaJumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int rounds = 10;

        System.out.println("🐵 Welcome to Banana Jumping Game!");
        System.out.println("Instructions:");
        System.out.println(" - Press 'j' to jump.");
        System.out.println(" - Avoid obstacles (#), collect bananas (B).");
        System.out.println(" - 10 rounds. Let's start!\n");
        for (int i = 1; i <= rounds; i++) {
            System.out.println("🎮 Round " + i);
            int object = rand.nextInt(3);
            String obstacle = "";

            if (object == 1) obstacle = "# Obstacle!";
            else if (object == 2) obstacle = "🍌 Banana!";

            System.out.println("Object Ahead: " + (object == 0 ? "Nothing" : obstacle));
            System.out.print("Do you want to jump? (j/n): ");
            String input = sc.next().toLowerCase();

            if (object == 1 && !input.equals("j")) {
                System.out.println("💥 Oh no! You hit an obstacle. Game Over!");
                break;
            } else if (object == 2 && input.equals("j")) {
                score++;
                System.out.println("🎉 You jumped and caught a banana!");
            } else if (object == 1 && input.equals("j")) {
                System.out.println("✔️ Good jump! Obstacle avoided.");
            } else {
                System.out.println("✔️ You safely continued.");
            }

            System.out.println("Current Score: " + score + "\n");
        }

        System.out.println("🏁 Game ended. Your final score: " + score);
    }
}
