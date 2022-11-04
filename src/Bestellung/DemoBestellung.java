package Bestellung;

public class DemoBestellung {
    public static void main(String[] args) {

        Bestellzeile zeile1 = new Bestellzeile("Fussball", 2, 30);
        Bestellzeile zeile2 = new Bestellzeile("Computer", 6, 1000);
        Bestellzeile zeile3 = new Bestellzeile("Bildschirm", 6, 250);
        Bestellzeile zeile4 = new Bestellzeile("Maus", 6, 50);
        
        Bestellzeile[] packet1 = new Bestellzeile[] {zeile1, zeile2, zeile3, zeile4};
        
        Bestellung auftrag1 = new Bestellung("A7B4", packet1);

        System.out.println("zeile3.getKosten() = " + zeile3.getKosten());

        auftrag1.printBestellung();

        System.out.println("Gesamtbetrag: " + auftrag1.getKosten());
        
    }
}
