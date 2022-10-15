public class Gehaltskonto {

    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;

    public Gehaltskonto (String inhaber, String iban, String bic){
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;

        this.kontostand = 0.0;
    }

    public void aufbuchen (double kontostand){
        this.kontostand = this.kontostand + kontostand;
    }

    public void abbuchen (double kontostand){
        if ((this.kontostand - kontostand) <= 0 ){
            System.out.println("Sie haben nicht genug am Konto für diese Buchung");
        }
        else {
            this.kontostand = this.kontostand - kontostand;
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
