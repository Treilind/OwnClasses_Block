public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;

    }

    public void push (Card newCard){
        this.counter ++;
        this.cards[counter] = newCard;
    }

    public Card pop () {
        Card less  = cards[counter];
        counter --;

        return less;
    }
}
