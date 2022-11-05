package CardStack;

public class Stack<T> {
    private T[] elements;
    private int counter;

    public int length;

    public Stack(T[] elements) {
        this.elements = elements;
        this.counter = -1;

        length = elements.length;

    }

    public void push (T newElement){
        this.counter ++;
        this.length ++;
        this.elements[counter] = newElement;
    }

    public T pop () {
        T less  = elements[counter];
        elements[counter] = null;
        counter --;
        this.length --;

        return less;
    }

    public T[] getCards() {
        return elements;
    }

    public int getCounter() {
        return counter;
    }
}
