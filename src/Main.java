import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        /*
        This project aims to develop my skills in writing code
        Project Name : Student Grades Management System
        */
        Scanner scanner = new Scanner(System.in);

        String name;
        int age ;
        double math ;
        double english ;
        double science ;
        double totalMarks ;
        double average ;
        double percentage ;
        boolean passed ;
        char grade ;

        System.out.println(" =========================================");
        System.out.println(" ===========    welcome SGMS   ===========");
        System.out.println(" =========================================");
        System.out.println("Enter your Name : ");
        name = scanner.nextLine(); // Don't use next() only when you need to make user store full name so use nextline()
        System.out.println("Enter your age : ");
        age = scanner.nextInt();
        System.out.println("Enter your Maths Grade : ");
        math = scanner.nextDouble();
        System.out.println("Enter your English Grade : ");
        english = scanner.nextDouble();
        System.out.println("Enter your Science Grade : ");
        science = scanner.nextDouble();
        if(age <=15){
            System.out.println("Student age not valid");

        }

        totalMarks = math + english + science ;
        average = (math + english + science)/3;
        percentage = (totalMarks/300)*100;
         if (percentage >= 60){
             passed = true;

         }
         else {
             passed = false;
         }

         if (average >= 90 && average <=100){
             grade = 'A';

         } else if (average >=80  && average <=89) {
             grade = 'B';

         } else if (average >= 70 && average <=79) {
             grade = 'C';
         } else if (average >= 60 && average <=69) {
             grade = 'D';

         }else {
             grade = 'F';

         }

        System.out.println(" Welcome " + " " + name);
        System.out.println("Yours semester marks is " + totalMarks);
        System.out.println("Yours semester average is " + average);
        System.out.println("Yours semester percentage is " + percentage +"%");
        System.out.println("Yours semester status is " + passed);
        System.out.println("Yours semester grade is " + grade);






    }


}
