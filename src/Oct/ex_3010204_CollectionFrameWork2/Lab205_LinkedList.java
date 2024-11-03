package Oct.ex_3010204_CollectionFrameWork2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab205_LinkedList {
    public static void main(String[] args) {
//        LinkedList mylist = new LinkedList();
        List mylist = new LinkedList(); //dynamic dispatch
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);//duplicate

        System.out.println(mylist);

        List mylist1 = new ArrayList();
        mylist1.add("Arul");
        mylist1.add("kumar");
        mylist1.add("mabel");
    }
}
