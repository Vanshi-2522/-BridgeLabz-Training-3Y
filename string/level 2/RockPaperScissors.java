import java.util.*;

public class RockPaperScissors {

    // Method to get computer's choice (rock, paper, scissors)
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Method to find winner between user and computer
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        switch (userChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "User" : "Computer";
            case "paper":
                return (computerChoice.equals("rock")) ? "User" : "Computer";
            case "scissors":
                return (computerChoice.equals("paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }

    // Method to calculate average & win percentage
    public static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        // User stats
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / games) + "%";

        // Computer stats
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / games) + "%";

        return stats;
    }

    // Method to display results of each game and stats
    public static void displayResults(List<String[]> gameResults, String[][] stats) {
        // Show game results
        System.out.printf("%-10s %-15s %-15s %-10s%n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("-----------------------------------------------------------");
        for (String[] result : gameResults) {
            System.out.printf("%-10s %-15s %-15s %-10s%n", result[0], result[1], result[2], result[3]);
        }

        // Show stats
        System.out.println("\nFinal Stats:");
        System.out.printf("%-10s %-10s %-15s%n", "Player", "Wins", "Win %");
        System.out.println("----------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-15s%n", row[0], row[1], row[2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of games
        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        sc.nextLine(); // consume newline

        int userWins = 0, computerWins = 0;
        List<String[]> gameResults = new ArrayList<>();

        for (int i = 1; i <= games; i++) {
            // User input
            System.out.print("Game " + i + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            // Computer choice
            String computerChoice = getComputerChoice();

            // Find winner
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            // Store result
            gameResults.add(new String[]{String.valueOf(i), userChoice, computerChoice, winner});
        }

        // Calculate stats
        String[][] stats = calculateStats(userWins, computerWins, games);

        // Display all results
        displayResults(gameResults, stats);
    }
}
