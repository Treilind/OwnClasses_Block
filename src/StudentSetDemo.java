import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {
       HashSet<Student> students = new HashSet<Student>();

       students.add(new Student(1234, "Thorsten Reisinger"));
       students.add(new Student(5678, "Luca Ronchetti"));
       students.add(new Student(1478, "Hansi Lauft"));
       students.add(new Student(1234, "Thorsten Reisinger"));

       students.remove(new Student(1478, "Hansi Lauft"));

       System.out.println(students.equals(new Student(1234, "Thorsten Reisinger")));

        for (Student student : students){
            System.out.println(student);
        }


    }
}
