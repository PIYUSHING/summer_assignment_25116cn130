//student record management system
import java.util.Scanner;
import java.util.ArrayList;
class Student{
    private int RollNumber;
    private String name;
    public static String school = "DELHI PUBLIC SCHOOL";
    public static String standard = "X";

    public Student(String name, int roll){
        this.name = name;
        this.RollNumber = roll;
    }

    public String getName(){
        return name;
    }
    public int getRoll(){
        return RollNumber;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void display(){
        System.out.println("--------------------");
        System.out.println("School      :- "+ school);
        System.out.println("Standard    :-" + standard);
        System.out.println("Roll Number :- " + RollNumber);
        System.out.println("Name        :- " + name);
        System.out.println("---------------------");
    }
}

class StudentManagement{
    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
    }

    public Student searchStudent(int RollNumber){
        for(Student s : students){
            if(s.getRoll() == RollNumber){
                return s;
            }
        }
        return null;
    }

    public void updateStudent(int RollNumber, String newName){
        Student s = searchStudent(RollNumber);
        if(s != null){
            s.setName(newName);
            System.out.println("Successfully Updated Student's details ");
        }
        else{
            System.out.println("No student found");
        }
    }

    public void displayAllAtudents(){
        for(Student  s : students){
            s.display();
        }
    }

}
public class program_105{
    public static void main(String[] args){
        StudentManagement sm = new StudentManagement();
        // Adding Students
        Scanner scanner = new Scanner(System.in);
        int Roll = scanner.nextInt();
        String name = scanner.next();
        boolean addMore = true;
        while(addMore){
            System.out.println("Choose options below to enter details");
            System.out.println("1. Enter Student's detail");
            System.out.println("2. Exit");
            switch(choice){
                case 1:
                    sm.addStudent(new Student(name, Roll));
                    break;
                case 2:
                    addMore = false;
                    break;
            }
        }

        //Displaying all Students
        sm.displayAllAtudents();

        //Searching Student
        int roll = 102;
        Student student = sm.searchStudent(roll);

        if (student != null) {
            System.out.println("\nStudent Found:");
            student.display();
        } else {
            System.out.println("Student not found.");
        }

        //Updating Student
        sm.updateStudent(102, "Anjalii");
        sm.displayAllAtudents();
    }
}