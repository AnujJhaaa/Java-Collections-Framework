import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks ;

    @Override
    public int compareTo(Student o) {
        return o.marks - this.marks;
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        // checking if object is null OR is of not same class(can use instanceof)
        if(obj == null || getClass() != obj.getClass()) return false;
        
        Student other = (Student) obj;
        return this.id == other.id &&
                this.marks == other.marks &&
                Objects.equals(this.name, other.name); // to avoid NullPointerException if name contains null.       
    }

    @Override
    public int hashCode(){
       return Objects.hash(id,name,marks); // generates has if a object has multiple fields.
    }

    @Override
    public String toString(){
        return "" + id + ":" + name + ":" + marks;
    }
}
