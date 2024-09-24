import java.util.Scanner;
public class IT24101474Lab7Q1A{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter marks for four subjects: ");
        int[] marks=new int[4];

        for(int i=0; i<4; i++){
            System.out.println("Enter subject mark" +(i+1)+ ":");
            marks[i]=scanner.nextInt();
        }
        double sum=0;


        for(int mark:marks){
            
            sum+=mark;
        }
        double average=sum/marks.length;
        System.out.println("Average is: " +average);

            String grade;
            if(average>=75 && average<=100){
                grade="Distinction";
            }
            else if(average>=50 && average<=74){
                grade="Credit";
            }
            else if(average>=0 && average<=49){
                grade="Fail";
            }
            else{
                grade="Invalid input";  

        }
        System.out.println("Overall Grade is: " +grade);


scanner.close();
    }
}
