import java.util.ArrayList;
import java.util.Comparator;

public class Laba4 {

    public static final ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        addStudents();
        students.sort(Comparator
                .comparing(Student::getSurname)
                .thenComparing(Student::getName, Comparator.reverseOrder()));
        students.forEach(Student::print);
    }

    public static void addStudents() {
        students.add(new Student("Wolf", "Anton", "QWE", 8, 43));
        students.add(new Student("Arsen", "Anton", "ASD", 12, 65));
        students.add(new Student("Arsen", "Bob", "ASD", 12, 65));
        students.add(new Student("Arsen", "Bob", "ASD", 12, 65));
        students.add(new Student("Wolf", "Bob", "ZXC", 12, 62));
        students.add(new Student("Wolf", "Wol", "QWE", 12, 62));
        students.add(new Student("Bush", "Arsen", "QWE", 1, 12));
    }
}