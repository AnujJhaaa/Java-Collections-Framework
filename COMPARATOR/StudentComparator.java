import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
       //we need to be carefull for NullPointerException.
        return o1.getMarks() - o2.getMarks();
    }  

    
}
