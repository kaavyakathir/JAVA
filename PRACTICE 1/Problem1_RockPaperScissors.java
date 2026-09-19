import java.util.*;

public class Problem1_RockPaperScissors {
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"}; // predefined for demo
        int N = playerMoves.length;
        Random rand = new Random();

        String[] roundResults = new String[N];
        String[] computerMoves = new String[N];
        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < N; i++) {
            computerMoves[i] = moves[rand.nextInt(3)];
            roundResults[i] = playRound(playerMoves[i], computerMoves[i]);

            if (roundResults[i].equals("Player Wins")) wins++;
            else if (roundResults[i].equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 0; i < N; i++) {
            System.out.printf("%5d | %11s | %14s | %s%n",
                    (i + 1), playerMoves[i], computerMoves[i], roundResults[i]);
        }

        double winPercentage = (wins * 100.0) / N;
        System.out.println("\nFinal Summary:");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
    }
}