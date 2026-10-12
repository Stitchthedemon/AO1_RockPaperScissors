import java.util.Scanner;

public class RockPaperScissors {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean validMove;

        System.out.println("Rock Paper Scissors Game");

        do {
            do {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = in.nextLine().trim();
                validMove = playerA.equalsIgnoreCase("R") ||
                        playerA.equalsIgnoreCase("P") ||
                        playerA.equalsIgnoreCase("S");
                if (!validMove) {
                    System.out.println("Invalid input You must enter R, P, or S.");
                }
            } while (!validMove);

            do {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = in.nextLine().trim();
                validMove = playerB.equalsIgnoreCase("R") ||
                        playerB.equalsIgnoreCase("P") ||
                        playerB.equalsIgnoreCase("S");
                if (!validMove) {
                    System.out.println("Invalid input You must enter R, P, or S.");
                }
            } while (!validMove);

            System.out.println("\nResults");
            if (playerA.equalsIgnoreCase(playerB)) {
                // It's a Tie
                if (playerA.equalsIgnoreCase("R")) System.out.println("Rock vs Rock it's a Tie!");
                else if (playerA.equalsIgnoreCase("P")) System.out.println("Paper vs Paper it's a Tie!");
                else System.out.println("Scissors vs Scissors it's a Tie!");
            } else if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock Crushes Scissors! Player A wins.");
                } else {
                    System.out.println("Paper Covers Rock! Player B wins.");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("Reflect") || playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper Covers Rock! Player A wins.");
                } else {
                    System.out.println("Scissors Slices Paper! Player B wins.");
                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors Slices Paper! Player A wins!");
                } else {
                    System.out.println("Rock Crushes Scissors! Player B wins!");
                }
            }

            // 4. Prompt to play again
            System.out.print("\nDo you want to play again? [Y/N]: ");
            playAgain = in.nextLine().trim();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
