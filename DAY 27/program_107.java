// salary management system
import java.util.Scanner;
public class program_107{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int employeeId;
        double salary;
        double hra, da, pf, gross, net;

        //input Employee Details
        System.out.println("==== Enter Employee Details ====");
        System.out.print("Enter Name  :- ");
        name = scanner.next();
        System.out.print("Employee Id :- ");
        employeeId = scanner.nextInt();
        System.out.println(" Salary   :- ");
        salary = scanner.nextDouble();

        hra = salary * 0.20; // House Renting Allowance 20%
        da = salary * 0.10; // Dearness Allowance 10%
        pf = salary * 0.12; // Provident Fund 12%

        gross = salary + hra + da;
        net = gross - pf;

        System.out.println("\n------ Salary Management System ------");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + salary);
        System.out.println("HRA (20%)     : " + hra);
        System.out.println("DA (10%)      : " + da);
        System.out.println("PF (12%)      : " + pf);
        System.out.println("Gross Salary  : " + gross);
        System.out.println("Net Salary    : " + net);

        scanner.close();

    }
}