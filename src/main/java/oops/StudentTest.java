package oops;
import java.util.*;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("rahul");
        s1.setRollno(21);

        System.out.println(s1);
        //System.out.println(s1.getName());

        // access modifier

        //Object class --> toString().

        //oops.Student@17c68925 hashcode

        //inheritance


//        parent class -- > base class
//        child class --> derived class
//        // inheritance
//        5type
//            1. single inheritance
//            2. multi level inheritance.
//            3. heriachical
//            4. hydrid.
//            5. multiple


//        1. github account
//        2. how to store code in github.
//        3. hackrank account - logic question.

        Student s2 = new Student(2,"ravi");
        System.out.println(s2);

        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());


        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


    }
}
