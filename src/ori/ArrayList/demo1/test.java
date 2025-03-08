package ori.ArrayList.demo1;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 1);
        Student s2 = new Student("lisi", 2);

        ArrayList <Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);

        for (Student student : list) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
