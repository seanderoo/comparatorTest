package comparators;

import model.Student;
import java.util.Comparator;

public class NameCmp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getStudentNummer(), o2.getStudentNummer());
    }
}
