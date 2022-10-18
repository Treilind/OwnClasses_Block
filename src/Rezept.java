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
        int mengeZutat;
        Rezept ergebnis = new Rezept(this.nameRezept, this.personen, this.zutaten);


        for (int i = 0; i < zutaten.length; i++) {
            Zutat eins = zutaten[i];
            mengeZutat = (eins.getMenge() / this.personen) * personen;

        }




        return ergebnis;
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
