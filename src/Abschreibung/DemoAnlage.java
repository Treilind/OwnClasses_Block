package Abschreibung;

public class DemoAnlage {
    public static void main(String[] args) {

        Anlage anlage1 = new Anlage("Laptop", 1500, 2);
        Anlage anlage2 = new Anlage("Auto", 30000, 5);

        anlage1.simulate(2, 800);

        System.out.println(anlage1.toString());

        System.out.println();
        System.out.println();

        anlage1.renew(2000, 2);
        System.out.println(anlage1.toString());


    }
}
