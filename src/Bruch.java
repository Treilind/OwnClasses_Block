public class Bruch {

    private int zaehler;
    private int nenner;


    public Bruch(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public double toDecimal(){
        double decimal = 0.0;

        decimal = this.zaehler / (this.nenner * 1.0);

        return decimal;
    }

    public void print (){
        System.out.println(this.zaehler + "/" + this.nenner);
    }

    public Bruch multiplicate (Bruch b2){
        int newZaehler = this.zaehler * b2.zaehler;
        int newNenner = this.nenner * b2.nenner;

        Bruch b1 = new Bruch(newZaehler, newNenner);


        return b1;
    }

    public Bruch multiplicate (Bruch b2, Bruch b3){
        return multiplicate(b2).multiplicate(b3);
    }

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }
}
