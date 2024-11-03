package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab200_List_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(92);
        list.add(34);
        list.add(45);
        list.add(67);
        System.out.println(list);
        //sorting
        //Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
