// mini project using arrays, strings and functions
import java.util.Scanner;
class Student{
    private int roll ;
    private String name ;
    private int marks ;

    public Student( int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMarks( int marks){
        this.marks = marks;
    }
    public int getRoll(){
        return roll;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public void display(){
        System.out.println("==== Student Details ====");
        System.out.println("Roll  :- " + roll);
        System.out.println("Name  :- "+ name);
        System.out.println("marks :- " + marks);
        System.out.println("--------------------------");
    }
}
class Record{
    private Scanner scanner = new Scanner(System.in);
    private int max = 100;
    private int count = 0;
    private Student[] arr = new Student[max];

    public boolean addStudent(){
        if(count == max){
            System.out.println("Record already full");
            return false;
        }
        System.out.print("Enter Roll :- ");
        int rollNo = scanner.nextInt();
        boolean Exists = false;
        for(Student sc : arr){
            if(sc != null){
                if(sc.getRoll() == rollNo){
                Exists = true;
                break;
                }
            }
        }
        if(Exists){
            System.out.println("Record already Exists");
            return false;
        }
        System.out.print("Enter Name :- ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter marks :- ");
        int marks = scanner.nextInt();
        arr[count] = new Student(rollNo, name, marks);
        System.out.println("Student added Successfully");
        count++;
        return true;
    }
    public Student searchStudent(){
        System.out.print("Search Roll :- ");
        int rollNo = scanner.nextInt();
        if(count == 0){
            System.out.println("Record Empty");
            return null;
        }
        for(Student st : arr){
            if(st != null && st.getRoll() == rollNo){
                st.display();
                return st;
            }
        }
        System.out.println("No record found");
        return null;
    }
    public void removeStudent(){
        Student st = searchStudent();
        if(st == null){
        System.out.println("No Such Record");
        return;
        }
        int roll = st.getRoll();
        int m = -1;
        for(int i =0; i<count; i++){
            if(arr[i].getRoll() == roll){
                m = i;
                break;
            }
        }
        for(int i=m; i<count-1; i++){
           arr[i] = arr[i+1];
        }
        arr[count - 1] = null;
        count--;
        System.out.println("Record Deleted Successfully");
    }
    public void updateRecord(){
        Student st = searchStudent();
        if(st != null){
            System.out.print("Enter New Name :- ");
        scanner.nextLine();
        String newName = scanner.nextLine();
        st.setName(newName);
        System.out.print("Enter New Marks :- ");
        int marks = scanner.nextInt();
        st.setMarks(marks);
        System.out.println("Record Updated");
        }
        else{
            System.out.println("NO Such Record");
        }
    }
    public void viewRecord(){
        if(count == 0){
            System.out.println("No Records Found");
            return;
        }

        for(int i = 0; i < count; i++){
            arr[i].display();
        }
    }
}
public class program_120{
    public static void main(String[] args){
        Record records = new Record();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("===== STUDENTS RECORD =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Update Student");
            System.out.println("5. View Record");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter choice :- ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    records.addStudent();
                    break;
                case 2:
                    records.searchStudent();
                    break;
                case 3:
                    records.removeStudent();
                    break;
                case 4:
                    records.updateRecord();
                    break;
                case 5:
                    records.viewRecord();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }
}