package cards;

public class PlayingCards {

    int faceValue;
    String suit;

    public PlayingCards(int faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String faceValueName = switch (faceValue) {
            case 0 -> "ace";
            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> Integer.toString(faceValue + 1);
            case 10 -> "jack";
            case 11 -> "queen";
            case 12 -> "king";
            default -> throw new IllegalArgumentException(
                    "Something went wrong " + faceValue + " is not a valid faceValue!"
            );
        };

        return faceValueName + " of " + suit;
    }
}