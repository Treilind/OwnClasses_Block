public class Anlage {

    private String bezeichnung;
    private double initialWert;
    private int nutzungsdauer;
    private double restWert;
    private int alter;

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
        this.bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;

        this.restWert = initialWert;
        this.alter = 0;
    }

    public void abschreiben () {
        this.alter ++;

        if (this.alter <= this.nutzungsdauer){
            this.restWert = Math.floor(this.initialWert / this.nutzungsdauer * (this.nutzungsdauer - this.alter));
        }
    }

    public void simulate (int maxJahre, int minWert){
        int i = 0;

       while (i < maxJahre || this.restWert > 0 || this.restWert > minWert){
           abschreiben();
           System.out.println("Restwert für das Jahr " + (i+1) + ": " + this.restWert);
          if ((i+1) == maxJahre) {
              System.out.println("Max Jahre erreicht");
              break;
          }
           else if (this.restWert == 0) {
               System.out.println("Restwert ist auf 0 gefallen.");
              break;
           } else if (this.restWert < minWert) {
               System.out.println("Restwert ist unter min Wert gefallen");
              break;
           }
           i++;
       }
    }

    public Anlage renew (double zusatzWert, int zusatzJahre){
        Anlage neu = null;

        zusatzWert = zusatzWert + this.restWert;
        zusatzJahre = (this.nutzungsdauer - this.alter) + zusatzJahre;

        neu = new Anlage(this.bezeichnung, zusatzWert, zusatzJahre);

        return neu;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getRestWert() {
        return restWert;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "Anlage{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", initialWert=" + initialWert +
                ", nutzungsdauer=" + nutzungsdauer +
                ", restWert=" + restWert +
                ", alter=" + alter +
                '}';
    }
}
