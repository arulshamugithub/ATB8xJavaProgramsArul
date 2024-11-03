package Oct.ex_3010204_CollectionFrameWork2;



import java.util.ArrayList;
import java.util.List;

public class Lab208_List {
    public static void main(String[] args) {
        student1 s1 = new student1("Arul", 120);
        student1 s2 = new student1("JK", 121);
        student1 s3 = new student1("priya", 122);

        List<student1> mystudents = new ArrayList<>();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);
        System.out.println(mystudents);
    }
}
    class student1{
        String name;
        int roll_no;

        public student1(String name, int roll_no) {
            this.name = name;
            this.roll_no = roll_no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoll_no() {
            return roll_no;
        }

        public void setRoll_no(int roll_no) {
            this.roll_no = roll_no;
        }

        @Override
        public String toString() {
            return "student1{" +
                    "name='" + name + '\'' +
                    ", roll_no=" + roll_no +
                    '}';
        }
    }

