package GenericStack;

public class Stack {

    private int[] elements;
    private int counter;

    public Stack(int[] elements) {
        this.elements = elements;
        this.counter = -1;
    }

    public int pop (){
        int less = this.elements[counter];
        return less;
    }
}
