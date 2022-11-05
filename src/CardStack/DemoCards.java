package CardStack;

public class DemoCards {
    public static void main(String[] args) {

        Card card1 = new Card(2, "green");
        Card card2 = new Card(1, "blue");
        Card card3 = new Card(7, "yellow");
        Card card4 = new Card(9, "green");
        Card card5 = new Card(3, "red");
        Card card6 = new Card(3, "blue");
        Card card7 = new Card(5, "yellow");
        Card card8 = new Card(4, "yellow");
        Card card9 = new Card(8, "green");
        Card card10 = new Card(6, "red");

        Card[] stack1 = new Card[10];
        
        Stack<Card> stack = new Stack<Card>(stack1);
        
        stack.push(card1);
        stack.push(card6);
        stack.push(card7);
        stack.push(card8);
        stack.push(card2);
        stack.push(card3);

        for (int i = 0; i <= stack.getCounter(); i++) {
            System.out.println("stack1[i] = " + stack1[i]);
            if (stack1[i+1] == null){
                break;
            }
        }

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        System.out.println();

        for (int i = 0; i <= stack.getCounter(); i++) {
            System.out.println("stack1[i] = " + stack1[i]);
            if (stack1[i+1] == null){
                break;
            }
        }
    }
        
}
