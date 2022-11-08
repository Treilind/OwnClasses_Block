import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        Student susi = new Student(5222, "Susi");
        Student hansi = new Student(1234, "Hansi");

        students.add(susi);
        students.add(hansi);

        students.remove(hansi);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println(students.contains(susi));

        boolean containSusi =  containsName(students, "susi");
        System.out.println("containSusi = " + containSusi);

        boolean containMatrikelNummer = containsMatrikelNr(students, 5222);
        System.out.println("containMatrikelNummer = " + containMatrikelNummer);

        System.out.println(students.contains(new Student(5222, "Susi")));


    }

    public static boolean containsName (ArrayList<Student> studentList, String searchName){
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getFullName().contains(searchName)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsMatrikelNr (ArrayList<Student> studentList, int searchMatrikelNr){

        for (Student student : studentList){
            if (student.getMatrNr() == searchMatrikelNr)
                return true;
        }
        return false;
    }
}
