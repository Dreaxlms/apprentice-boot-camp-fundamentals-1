package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String result[] = new String[52];
        int[][] deck = new int[52][2];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit*13+faceValue] = new int[]{suit, faceValue};
            }
        }

        int cardNumber = 0;
        for (int[] card : deck) {
            String faceValueName = switch (card[1]) {
                case 0 -> "ace";
                case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> Integer.toString(card[1] + 1);
                case 10 -> "jack";
                case 11 -> "queen";
                case 12 -> "king";
                default ->
                        throw new IllegalArgumentException("Something went wrong " + card[1] + "is not a valid faceValue!");
            };

            String suitName;
            switch (card[0]){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suitName!");
            }

            result[cardNumber] = new PlayingCards(card[1], suitName).toString();
            cardNumber++;
        }

        return result;
    }
}
