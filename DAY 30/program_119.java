// mini employee management system
import java.util.Scanner;
import java.util.ArrayList;
class Employee{
    private int employeeId;
    private int salary;
    private String name;
    public static String company = "XYZ";
    
    //constructer 
    public Employee(String name, int employeeId, int salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //getter
    public String getName(){
        return name;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public int getSalary(){
        return salary;
    }

    //setter
    public void setNew(String newName, int newSalary){
        this.name = newName;
        this.salary = newSalary;
    }

    //display
    public void display(){
        System.out.println("==== Employee Details ====");
        System.out.println("Company     :- " + company);
        System.out.println("Employee Id :- " + employeeId);
        System.out.println("Name        :- " + name);
        System.out.println("Salary      :- " + salary);
    }
}
class EmployeeManagement{
    public ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp){
        employees.add(emp);
        System.out.println("Employee added Successfully");
    }

    public Employee searchEmployee(int employeeId){
         for(Employee emp : employees){
            if(emp.getEmployeeId() == employeeId){
                return emp;
            }
         }
         return null;
    }

    public void updateEmployee(int employeeId, String newName, int salary){
        Employee emp = searchEmployee(employeeId);
        if(emp != null){
            emp.setNew(newName, salary);
            System.out.println("Details updated");
        }
        else{
            System.out.println("Employe not found ");
        }
    }

    public void displayAllEmployee(){
        if(employees.isEmpty()){
            System.out.println("No Employes found");
            return;
        }
        for(Employee emp : employees){
            emp.display();
        }
    }
}
public class program_119{
    public static void main(String[] args){
        EmployeeManagement em = new EmployeeManagement();
        
        // add employee
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("choose the options below to add Employee");
            System.out.println("1. Add Employee ");
            System.out.println("2. search Employee ");
            System.err.println("3. Update Details");
            System.out.println("4. Display All Empolyee");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Employee Name");
                    String name = scanner.next();
                    System.out.println("Enter employeeId ");
                    int employeeId = scanner.nextInt();
                    System.out.println("Enter salary");
                    int salary = scanner.nextInt();
                    em.addEmployee(new Employee(name, employeeId, salary));
                    break;
                case 2:
                    System.out.println("Enter employeeId to search");
                    int id = scanner.nextInt();
                    Employee emp = em.searchEmployee(id);
                    if(emp != null){
                        emp.display();
                    }
                    else{
                        System.out.println("Employee not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter Employee Name");
                    String newName = scanner.next();
                    System.out.println("Enter employeeId ");
                    int newEmployeeId = scanner.nextInt();
                    System.out.println("Enter salary");
                    int newSalary = scanner.nextInt();
                    em.updateEmployee(newEmployeeId, newName, newSalary);
                    break;
                case 4:
                    em.displayAllEmployee();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting......");
                    break;
                default :
                    System.out.println("invalid choice");
                    break;
            }
        }
        scanner.close();
    }
}