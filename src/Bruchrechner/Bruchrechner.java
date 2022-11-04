package Bruchrechner;

public class Bruchrechner {
    public static void main(String[] args) {
        
        Bruch bruch1 = new Bruch(3,5),
         bruch2 = new Bruch(6, 7),
         bruch3 = new Bruch(5, 17);


        Bruch[] arrayBruch = new Bruch[] {bruch1, bruch2, bruch3};

        System.out.println("bruch1.toDecimal() = " + bruch1.toDecimal());
        bruch1.print();

        System.out.println("bruch2.toDecimal() = " + bruch2.toDecimal());
        bruch2.print();

        Bruch result = bruch1.multiplicate(bruch2);
        result.print();

        Bruch resultArry = new Bruch(0, 0);

        resultArry  = resultArry.multiplicate(arrayBruch);
        resultArry.print();

        resultArry.trim();
        resultArry.print();
    }
}
