package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab198_List_2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bread");
        list.add("Butter");
        list.add("Milk");
        list.add("Paneer");
        list.add(123);
        //System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1)); //return false coz its a integer
        System.out.println(list.contains("1"));//returns true coz we are searching string
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("for each loop");
        for(Object o:list){
            System.out.println(o);
        }
    }
}
