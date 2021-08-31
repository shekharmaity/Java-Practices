package oops;

public class Student {
    //field
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//what is constructor
    public Student() {
        System.out.println("student created");
    }

    public Student(int rollno1, String name1) {
        this.rollno = rollno1;
        this.name = name1;
    }

    //destructor C,C++

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("rollno=").append(rollno);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return this.rollno;
    }
}
