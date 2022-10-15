public class Gehaltskonto {

    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;


    //code --> generate --> constructor
    public Gehaltskonto (String inhaber, String iban, String bic){
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;

        this.kontostand = 0.0;
    }

    public void aufbuchen (double wert){
        if (wert > 0) {
            this.kontostand = this.kontostand + wert;
            System.out.println("Aufbuchungswert:" + wert + "  Neuer Kontostand: " + this.kontostand);
        }
        else
            System.out.println("Wert muss positiv sein" + wert);
    }

    public void abbuchen (double wert){
        if (wert > 0) {
            if ((this.kontostand - wert) <= 0) {
                System.out.println("Sie haben nicht genug am Konto für diese Buchung");
            } else {
                this.kontostand = this.kontostand - wert;
                System.out.println("Abbuchungswert:" + wert + "  Neuer Kontostand: " + this.kontostand);
            }
        }
        else {
            System.out.println("Wert muss positiv sein: " +wert);
        }
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
