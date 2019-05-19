import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentSorter implements Comparator {
    public int compare(Object o1, Object o2) {

        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if (s1.getStudent_age() == s2.getStudent_age()) {

            int answer = s1.getStudent_name().compareTo(s2.getStudent_name());
            return answer == 0 ? s1.getStudent_id().compareTo(s2.getStudent_id()) : answer;
        }
        else
        {
            return s1.getStudent_age() > s2.getStudent_age()? 1 : -1;
        }

    }



}