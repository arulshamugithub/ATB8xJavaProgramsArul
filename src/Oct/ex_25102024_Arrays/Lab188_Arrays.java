package Oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab188_Arrays {
    public static void main(String[] args) {
        int[] marks = {78,90,98,94,91};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);

        int[] marks_2 = new int[5];
        marks_2[0] = 23;
        marks_2[1] = 34;
        marks_2[2] = 34;
        marks_2[3] = 34;
        marks_2[4] = 34;
//        System.out.println(marks_2[4]);
        Arrays.sort(marks);
        for(int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }

}
