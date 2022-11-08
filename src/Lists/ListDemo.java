package Lists;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>(); //strg + alt + v

        integers.add(1);
        integers.add(3);
        System.out.println(integers.size());

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hallo");
        System.out.println(strings.size());

        boolean contains = integers.contains(3);
        System.out.println("contains = " + contains);

        integers.add(1, 10); // füge an der zweiten Stelle 10 ein weil 0 die erste Stelle ist
        System.out.println(integers.size());


        //iterieren --> Möglichkeit 1
        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Zahl:" + integers.get(i));
        }

        //füge an der ersten Stelle die Zahl 20 ein
        integers.add(0,20);

        //iterieren --> 2. Möglichkeit --> foreach Schleife
        for (int number : integers){
            System.out.println("number = " + number);
        }
    }
}
