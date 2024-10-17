package Oct.ex_16102024;

public class Lab153 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Arul");
        ATB s3 = new ATB("Mottu");
        ATB s4 = new ATB("Desi");
        ATB a2;
        ATB s5 = new ATB("LL");
        ATB.doAssignments();
        s1.readDocuments();

    }
}

class ATB{

    {
        System.out.println("IIB");
    }
    static{
        System.out.println("I'll load once with class");
    }

    private String name;
    private int phone;
    static String course_name = "ATB8x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    void readDocuments(){
        System.out.println("Non-static method");
        System.out.println(course_name);
    }

    static void doAssignments(){
       // System.out.println(phone); static method cant use instance variable
        System.out.println("Static function");
    }
}
