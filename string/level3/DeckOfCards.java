import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Fill deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap deck[i] with deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute n cards among x players
    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        // Check if distribution is possible
        if (numPlayers * (numCards / numPlayers) < numCards) {
            System.out.println("Cards cannot be distributed equally among players!");
            return null;
        }

        int cardsPerPlayer = numCards / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " has:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("   " + players[i][j]);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Suits and Ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle deck
        shuffleDeck(deck);

        // Take user inputs
        System.out.print("Enter number of cards to distribute: ");
        int numCards = sc.nextInt();

        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        // Distribute cards
        String[][] players = distributeCards(deck, numCards, numPlayers);

        // Print results
        printPlayers(players);
    }
}
