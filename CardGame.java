// Tanner Smith
// tanmanalan@gmail.com
// For Mr. Gross's programming class 

import java.util.ArrayList;
import java.util.Collections;

// Base class for Card
class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Derived class for ScoredCard (inherits from Card)
class ScoredCard extends Card {
    public ScoredCard(String rank, String suit) {
        super(rank, suit);
    }

    // Calculate the score of the card
    public int getScore() {
        switch (getRank()) {
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            case "Ace":
                return 11;
            default:
                return Integer.parseInt(getRank());
        }
    }
}

// CardGame class to manage the game
public class CardGame {

    public static void main(String[] args) {
        // Initialize the deck
        ArrayList<ScoredCard> deck = initializeDeck();

        // Shuffle the deck
        Collections.shuffle(deck);

        // Deal cards to the 4 players
        ArrayList<ArrayList<ScoredCard>> hands = dealCards(deck, 4, 6);

        // Find scores for each player
        int[] scores = new int[4];
        for (int i = 0; i < 4; i++) {
            scores[i] = calculateScore(hands.get(i));
            System.out.println("Player " + (i + 1) + "'s hand: " + hands.get(i) + " - Score: " + scores[i]);
        }

        // Determine the winner
        int highestScore = 0;
        int winner = -1;
        for (int i = 0; i < 4; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                winner = i;
            }
        }

        System.out.println("\nThe winner is Player " + (winner + 1) + " with a score of " + highestScore + "!");
    }

    // Initialize the deck of cards
    public static ArrayList<ScoredCard> initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        ArrayList<ScoredCard> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new ScoredCard(rank, suit));
            }
        }
        return deck;
    }

    // Deal cards to players
    public static ArrayList<ArrayList<ScoredCard>> dealCards(ArrayList<ScoredCard> deck, int numPlayers, int cardsPerPlayer) {
        ArrayList<ArrayList<ScoredCard>> hands = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            hands.add(new ArrayList<>());
        }

        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                hands.get(j).add(deck.remove(0));
            }
        }

        return hands;
    }

    // Calculate the score of a hand
    public static int calculateScore(ArrayList<ScoredCard> hand) {
        int score = 0;
        int[] rankCount = new int[13]; // To track pairs and triples

        for (ScoredCard card : hand) {
            score += card.getScore();

            // Track rank counts for bonuses
            int rankIndex = getRankIndex(card.getRank());
            if (rankIndex != -1) {
                rankCount[rankIndex]++;
            }
        }

        // Add bonuses for pairs and triples
        for (int count : rankCount) {
            if (count == 2) {
                score += 5; // Pair bonus
            } else if (count == 3) {
                score += 10; // Triple bonus
            }
        }

        return score;
    }

    // Get the index of a rank for tracking pairs/triples
    public static int getRankIndex(String rank) {
        switch (rank) {
            case "2": return 0;
            case "3": return 1;
            case "4": return 2;
            case "5": return 3;
            case "6": return 4;
            case "7": return 5;
            case "8": return 6;
            case "9": return 7;
            case "10": return 8;
            case "Jack": return 9;
            case "Queen": return 10;
            case "King": return 11;
            case "Ace": return 12;
            default: return -1;
        }
    }
}
