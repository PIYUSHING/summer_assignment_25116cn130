// marksheet generation system
import java.util.Scanner;
public class program_108{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int roll;
        String grade;
        double english,maths,science,social,computer;
        double total, percentage;

        System.out.println("Enter Students Details ");
        System.out.print("Enetr Name :-" );
        name = scanner.next();
        System.out.print("Enter Roll :- " );
        roll = scanner.nextInt();
        System.out.println("Enter Marks of respective Subjects");
        System.out.print("English :-");
        english = scanner.nextDouble();
        System.out.println("Maths :- ");
        maths = scanner.nextDouble();
        System.out.println("Science :- ");
        science = scanner.nextDouble();
        System.out.println("Social :- ");
        social = scanner.nextDouble();
        System.out.println("Computer :- ");
        computer = scanner.nextDouble();

        total = english+science+social+maths+computer;
        percentage = (total/5);

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("====== MARKSHEET ======");
        System.out.println("Name       :- " + name);
        System.out.println("Roll       :- "+ roll);
        System.out.println();
        System.out.println("English    :-" + english);
        System.out.println("Maths      :-" + maths);
        System.out.println("Science    :-" + science);
        System.out.println("Social     :-" + social);
        System.out.println("Computer   :-" + computer);
        System.out.println();
        System.out.println("Total      :- " + total);
        System.out.println("Percentage :- " + percentage +"%");
        System.out.println("Grade      :- " + grade);

        scanner.close();
    }
}