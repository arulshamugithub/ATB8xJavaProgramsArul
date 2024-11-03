package Oct.ex_28102024_CollectionFramework;

import java.util.List;

public class Lab198_List {
    public static void main(String[] args) {
        //List list = new List(); List is an interface so we cant create object
        List list = List.of("Apple","Mango","Grapes","Orange");
        System.out.println(list);
        System.out.println(list.size());
    }
}
