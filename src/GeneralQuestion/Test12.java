package GeneralQuestion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Test12 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2, "Sid", 20));
        studentList.add(new Student(4, "Amit", 10));
        studentList.add(new Student(3, "Zafar", 40));
        studentList.add(new Student(1, "Prem", 30));

        System.out.println("Sorting By  Roll Number" );
        Collections.sort(studentList);
        for (Student list:studentList){
            System.out.println(list.getRoll() +" " + list.getName() +" " + list.getMarks());
        }

        System.out.println("Sorting By Student Name " );
        NameCompare nameCompare=new NameCompare();
        Collections.sort(studentList,nameCompare);
        for (Student list:studentList){
            System.out.println(list.getRoll() +" " + list.getName() +" " + list.getMarks());
        }

        System.out.println("Sorting By Student Name " );
        MarkCompare markCompare=new MarkCompare();
        Collections.sort(studentList,markCompare);
        for (Student list:studentList){
            System.out.println(list.getRoll() +" " + list.getName() +" " + list.getMarks());
        }




    }
}

class Student implements Comparable<Student> {
    int roll;
    String name;
    double marks;

    public int compareTo(Student o) {
        return this.roll - o.roll;
    }

    Student() {
    }

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }


}

class MarkCompare implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getMarks() < s2.getMarks()) return -1;
        if(s1.getMarks() > s2.getMarks()) return 1;
        else return 0;
    }
}

class NameCompare implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return  s1.getName().compareTo(s2.getName()) ;
    }
}








