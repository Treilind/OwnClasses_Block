public class Card {

    private int value;
    private String colour;

    public Card(int value, String colour) {

        if (value >= 1 && value <= 9) {
            this.value = value;
        }
        else {
            System.out.println("Der erlaubte Wertebereich ist 1 bis 9. Deine eingegebene Zahl: " + value);
        }

        if (colour.equals("blue")  || colour.equals("green") || colour.equals("yellow") || colour.equals("red")){
            this.colour = colour;
        }
        else {
            System.out.println("Die erlaubten Farben sind: blue, green, yellow und red. Deine Farbe ist: " + colour);
        }
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
