public class Bruch {

    private int zaehler;
    private int nenner;


    public Bruch(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public double toDecimal() {
        double decimal = 0.0;

        decimal = this.zaehler / (this.nenner * 1.0);

        return decimal;
    }

    public void print() {
        System.out.println(this.zaehler + "/" + this.nenner);
    }

    public Bruch multiplicate(Bruch b2) {
        int newZaehler = this.zaehler * b2.zaehler;
        int newNenner = this.nenner * b2.nenner;

        Bruch b1 = new Bruch(newZaehler, newNenner);


        return b1;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
        return multiplicate(b2).multiplicate(b3);
    }

    public Bruch multiplicate(Bruch[] arr) {
        Bruch multipicatedBruch = null;

        /*for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                multipicatedBruch = arr[i];
            }
            else {
                multipicatedBruch = multiplicate(arr[i], arr[i-1]);
            }

        }*/

        if (arr.length >= 2) {
            multipicatedBruch = arr[0];
            for (int i = 1; i < arr.length; i++) {
                multipicatedBruch = multipicatedBruch.multiplicate(arr[i]);
            }
        }

        return multipicatedBruch;
    }

    public void trim() {
        int tempZaehler = this.zaehler,
                tempNenner = this.nenner,
                rest;

         while (tempNenner != 0){
             rest = tempZaehler % tempNenner;
             tempZaehler = tempNenner;
             tempNenner = rest;
         }

        if (tempZaehler > 1) {
            this.zaehler /= tempZaehler;
            this.nenner /= tempZaehler;
        }
    }


    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }
}
