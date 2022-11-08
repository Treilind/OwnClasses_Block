import java.util.HashSet;

public class SetsDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<String>();

        strings.add("Hallo");
        strings.add("Servus");
        System.out.println(strings.size());
        System.out.println(strings.toString());

        strings.add("Hallo");
        System.out.println(strings.size());
        System.out.println(strings.toString());

        HashSet<Person> persons = new HashSet<Person>();
        persons.add(new Person("Max", "Mustermann"));
        persons.add(new Person("Max", "Mustermann"));
        System.out.println(persons.toString());

    }




}
