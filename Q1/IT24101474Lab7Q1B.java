import java.util.Scanner;

public class IT24101474Lab7Q1B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
   
        for (int student = 1; student <= 3; student++) {
            System.out.print("Enter marks for four subjects for student " + student + "(in one line with spaces):");
            String input = s.nextLine();

            String[] marksString = input.split(" ");
            int[] marks = new int[4];


            for (int i = 0; i <4; i++) {
                marks[i] = Integer.parseInt(marksString[i]);
            }
            double sum = 0;
            for (int mark : marks) {
                sum += mark;
            }


            double average = sum / 4;
            System.out.println("Average is: "  +average);

            String grade;
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average < 75) {
                grade = "Credit";
            } else if (average >= 0 && average < 50) {
                grade = "Fail";
            } else {
                grade = "Invalid input";
            }
            System.out.println("Overall Grade is: " + grade);
        }

        s.close();
    }
}
