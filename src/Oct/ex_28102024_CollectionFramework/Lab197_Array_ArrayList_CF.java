package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;

public class Lab197_Array_ArrayList_CF {
    public static void main(String[] args) {

        ArrayList studentList = new ArrayList();
        studentList.add("Arul");
        studentList.add("JK");
        studentList.add("Arul");//duplicate allowed
        studentList.add(true);
        studentList.add(123);//different data types
        studentList.add(null);
        System.out.println(studentList);

    }
}
