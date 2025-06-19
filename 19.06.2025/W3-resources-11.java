import java.util.*;

public class SimpleLudoGame {
    static final int WINNING_POSITION = 30;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of players (2 to 4): ");
        int numPlayers = sc.nextInt();

        if (numPlayers < 2 || numPlayers > 4) {
            System.out.println("Invalid number of players. Exiting...");
            return;
        }

        int[] positions = new int[numPlayers];
        boolean gameOver = false;

        System.out.println("\n🎲 Starting Ludo Game with " + numPlayers + " players...");
        
        while (!gameOver) {
            for (int i = 0; i < numPlayers; i++) {
                System.out.println("\nPlayer " + (i + 1) + "'s turn. Press Enter to roll the die...");
                sc.nextLine();
                int roll = rand.nextInt(6) + 1;
                System.out.println("🎲 You rolled: " + roll);

                positions[i] += roll;
                System.out.println("Player " + (i + 1) + " moves to position " + positions[i]);

                if (positions[i] >= WINNING_POSITION) {
                    System.out.println("\n🏁 Player " + (i + 1) + " WINS!");
                    gameOver = true;
                    break;
                }
            }
        }

        System.out.println("\n🎮 Game Over. Thanks for playing!");
    }
}
