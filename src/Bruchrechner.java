public class Bruchrechner {
    public static void main(String[] args) {
        
        Bruch bruch1 = new Bruch(3,5);
        Bruch bruch2 = new Bruch(6, 7);

        System.out.println("bruch1.toDecimal() = " + bruch1.toDecimal());
        bruch1.print();

        System.out.println("bruch2.toDecimal() = " + bruch2.toDecimal());
        bruch2.print();

        Bruch result = bruch1.multiplicate(bruch2);
        result.print();
    }
}
