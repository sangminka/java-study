package ex13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student{
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}

public class SortTest {
    public static void main(String[] args) {
        Student array[] = {
          new Student(1,"김철수"),
          new Student(2,"이철수"),
          new Student(3,"박철수"),
        };
        List<Student> list = Arrays.asList(array);
        System.out.println(list);
        System.out.println(list);


    }
}
