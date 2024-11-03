package Oct.ex_30102024_List;

import java.util.*;

public class Lab209_SET_HS_LHS_TS {
    public static void main(String[] args) {
        //Set = doesnt allow duplicate
        //List = allows duplicate



        Set hs = new HashSet(); //hashing mechanism to store the element, no order
        hs.add("Apple");
        hs.add("apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet();//black and Red tree mechanism to sort the element
        ts.add("WaterMelon");
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        //ts.add(null); jave.lang.nullpointerException
        System.out.println(ts);

        for(Object str : ts){
            System.out.println(str);
        }
        System.out.println("Iterator printing method");
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
