package Task.sep200924;

public class task003 {
    public static void main(String[] args) {
        int a = 25;
        if(a%3 == 0 && a%5==0 )
        {
            System.out.println("FizzBuzz");
        } else if(a%3==0 && a%5 != 0)
        {
            System.out.println("Fuzz");
        } else if (a%3 != 0 && a%5 == 0)
        {
            System.out.println("Buzz");
        } else {
            System.out.println("Number is not divided by 3 & 5");
        }
    }


}
