package Oct.ex_09102024_inheritance.singleinheritance.ex1;

public class Son extends Father {

    // Father --> Son
     void bhk3(){
        System.out.println("3bhk");
        //attribute father
        System.out.println(gold_f);
        //behavior father
        bhk2();
    }
}
