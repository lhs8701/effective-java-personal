package ch02.item01;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Student elementarySchoolStudent(String name){
        return new Student(name, 8);
    }

    public static Student middleSchoolStudent(String name){
        return new Student(name, 14);
    }

    public static Student highSchoolStudent(String name){
        return new Student(name, 17);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
