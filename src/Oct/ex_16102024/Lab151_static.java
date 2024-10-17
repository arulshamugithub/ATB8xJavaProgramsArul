package Oct.ex_16102024;

public class Lab151_static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(34);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);
    }

}
class Student{
    int age;//instance variable
    static String school_name = "ABC";

    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do with code");
        System.out.println("Read a MySQL DB()");
    }

    static{
        System.out.println("SIB");
        System.out.println("Loaded once, when is loaded");
    }
    public Student(int age) {
        this.age = age;
    }
}
