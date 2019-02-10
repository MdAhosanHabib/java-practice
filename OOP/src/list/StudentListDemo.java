package list;

import java.util.LinkedList;

public class StudentListDemo {

    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();

        Student s1 = new Student("Ahosan", "CSE", 974);
        Student s2 = new Student("Habib", "CSE", 975);
        Student s3 = new Student("Rakib", "CSE", 976);
        Student s4 = new Student("Babu", "CSE", 977);
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        for(Student s: list){
            System.out.println(s.id+" "+s.name+" "+s.dept);
        }
    }
}
