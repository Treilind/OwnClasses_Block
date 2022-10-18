public class Rezept {

    private String nameRezept;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String nameRezept, int personen, Zutat[] zutaten) {
        this.nameRezept = nameRezept;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public void printRezept() {
        System.out.println("nameRezept = " + nameRezept);
        for (int i = 0; i < zutaten.length; i++) {
            System.out.println("Zutat" + (i+1) + ": " + zutaten[i].getName() + "  " + zutaten[i].getMenge());
        }
    }

    public Rezept umrechnen (int personen){
        Rezept newRezept = null;
        Zutat[] newZutaten = null;

        if (this.zutaten.length > 0) {
            newZutaten = new Zutat[this.zutaten.length];

            for (int i = 0; i < this.zutaten.length; i++) {
                int oldMenge = this.zutaten[i].getMenge();
                int newMenge = oldMenge / this.personen * personen;

                newZutaten[i] = new Zutat(this.zutaten[i].getName(), newMenge);
            }

           newRezept = new Rezept(this.nameRezept, personen, newZutaten);
        }


        return newRezept;
    }

    public String getNameRezept() {
        return nameRezept;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }
}
