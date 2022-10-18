public class DemoRezept {
    public static void main(String[] args) {

        Zutat zutat1 = new Zutat("Putenfleisch", 500);
        Zutat zutat2 = new Zutat("Mehl", 700);
        Zutat zutat3 = new Zutat("Ei", 4);
        Zutat zutat4 = new Zutat("Semmelbroesel", 700);

        Zutat[] zutatenListe = new Zutat[]{zutat1, zutat2, zutat3, zutat4};

        Rezept rezept1 = new Rezept("Schnitzel", 4, zutatenListe);

        rezept1.printRezept();

        rezept1.umrechnen(8).printRezept();




    }
}
