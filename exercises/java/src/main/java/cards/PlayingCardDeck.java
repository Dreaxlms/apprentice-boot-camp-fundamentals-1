import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck extends Deck {
    List<PlayingCard> cards;

    PlayingCardDeck() {
        this.cards = new ArrayList<>();
        Suit[] suits = {new Suit("clubs"), new Suit("diamonds"), new Suit("hearts"), new Suit("spades")};
        for (int i = 0; i < 52; i++) {
            this.cards.add(new PlayingCard((i % 13), suits[i/13]));
        }
    }

    @Override
    public String toString() {
        return this.cards.toString();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            PlayingCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }
}