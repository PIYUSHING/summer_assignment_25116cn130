import java.util.*;
public class program_104{
    public static void main(String[] args){
        System.out.println("\n==== Welcome to Quiz Game ====");
        Scanner scanner = new Scanner(System.in);
        int marks = 0;

        System.out.println("Q1. Where is the capital of India");
        System.out.println("1. Delhi");
        System.out.println("2. Patna");
        System.out.println("3. Noida");
        System.out.println("4. Varanasi");
        int choice1 = scanner.nextInt();
        switch(choice1){
            case 1:
                System.out.println("correct answer");
                marks++;
                break;
            case 2:
                System.out.println("incorrect answer");
                break;
            case 3:
                System.out.println("incorrect answer");
                break;
            case 4:
                System.out.println("incorrect answer");
                break;
        }
        System.out.println("Q2. Where is the capital of Bihar");
        System.out.println("1. Delhi");
        System.out.println("2. Patna");
        System.out.println("3. Noida");
        System.out.println("4. Varanasi");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Incorrect answer");
                break;
            case 2:
                System.out.println("correct answer");
                marks++;
                break;
            case 3:
                System.out.println("incorrect answer");
                break;
            case 4:
                System.out.println("incorrect answer");
                break;
        }
        
        System.out.println("Q3. Where is the capital of UP");
        System.out.println("1. Delhi");
        System.out.println("2. Patna");
        System.out.println("3. Lucknow");
        System.out.println("4. Varanasi");
        int choice3 = scanner.nextInt();
        switch(choice3){
            case 1:
                System.out.println("Incorrect answer");
                break;
            case 2:
                System.out.println("incorrect answer");
                break;
            case 3:
                System.out.println("correct answer");
                marks++;
                break;
            case 4:
                System.out.println("incorrect answer");
                break;
        }
 
        System.out.println("marks obtained :- " + marks);
        scanner.close();
    }
}