package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab202_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Arul");
        mylist.add("JK");
        mylist.add("priya");
        mylist.add("Joel");
        mylist.add("Mabel");

        for (String str : mylist){
            System.out.println(str);
        }
        System.out.println("----------------");
        for(int i = 0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }
        System.out.println("Iterator printing");
        //Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
