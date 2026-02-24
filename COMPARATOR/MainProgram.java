import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        Student student1 = new Student(1,"student1",20);
        Student student2 = new Student(2,"student2",60);
        Student student3 = new Student(3,"student3",50);
        Student student4 = new Student(4,"student4",40);
        Student student5 = new Student(5,"student5",30);

        Student[] array = {student1,student2,student3,student4,student5};
        System.out.println(Arrays.toString(array));

        //Using Comparable in the Student Class
        Arrays.sort(array);
        System.out.println("\n" + Arrays.toString(array));
        
        //Using Comparator Object
        Arrays.sort(array, new StudentComparator());
        System.out.println("\n" + Arrays.toString(array));

        //Using Lambda func.
        Arrays.sort(array, (o1,o2) -> o2.getId() - o1.getId());
        System.out.println("\n" + Arrays.toString(array));


    }
}
