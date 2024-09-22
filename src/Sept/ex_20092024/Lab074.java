package Sept.ex_20092024;

public class Lab074 {
    public static void main(String[] args) {
        //grade calculator
        char grade = 'F';
        int score = 85;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score <= 89 && score >= 70) {
            grade = 'B';
        } else if (score <= 69 && score >= 50) {
            grade = 'C';
        } else if (score >= 35 && score <= 49) {
            grade = 'D';
        } else if (score <= 0 && score >= 100) {
            System.out.println("you are god");
            grade = 'O';
        } else {
            grade = 'F';

        }
        System.out.println("your grade is=" + grade);

    }
    }