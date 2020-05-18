/*
Tema: Generics e interface Comparable (usa generics)
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {


    public static void main(String[] args){
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student a = new Student("jere");
        Student b = new Student("agustin");
        
        System.out.println(first.compareTo(second));
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(a);
        studentList.add(b);
        studentList.add(first);
        studentList.add(second);
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
