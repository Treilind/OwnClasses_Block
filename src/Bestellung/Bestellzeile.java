package Bestellung;

public class Bestellzeile {

    private String name;
    private int menge;
    private int preis;

    public Bestellzeile(String name, int menge, int preis) {
        this.name = name;
        this.menge = menge;
        this.preis = preis;
    }

    public double getKosten (){
        double kosten = this.menge * this.preis;

        return kosten;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public int getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Bestellung.Bestellzeile{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                ", preis=" + preis +
                '}';
    }
}
