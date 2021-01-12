package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 2, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

        students.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        }).filter(e -> e.getSex() == 'f').sorted((x, y) -> x.getAge() - y.getAge()).forEach(e -> System.out.println(e));


//        students = students.stream().filter(e ->
//                e.getAge() > 22 && e.getAvrGrade() < 7.3).collect(Collectors.toList());

        System.out.println(students);

        int ar[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(Arrays.stream(ar).filter(e -> e % 2 == 0).toArray()));

//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//
//        students = myStream.filter(e -> e.getAge() > 22 && e.getAvrGrade() < 7.4).collect(Collectors.toList());
//        System.out.println(students);

        students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avrGrade;

    public Student(String name, char sex, int age, int course, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avrGrade=" + avrGrade +
                '}' +
                '\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    public void setAvrGrade(double avrGrade) {
        this.avrGrade = avrGrade;
    }
}
