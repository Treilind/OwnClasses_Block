package Bestellung;

public class Bestellung {

    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public void printBestellung (){
        for (int i = 0; i < this.zeilen.length; i++) {
            System.out.println("Artikel" + (i+1) + ": "+ this.zeilen[i].toString());
        }
    }

    public double getKosten (){
        double kosten = 0.0;
        for (int i = 0; i < this.zeilen.length; i++) {
            if (i == 0)
                kosten = zeilen[i].getKosten();
            else {
                kosten = kosten + zeilen[i].getKosten();
            }
        }
        return kosten;
    }



    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }
}
