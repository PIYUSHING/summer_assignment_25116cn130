// menu-driven calculator
import java.util.Scanner;
public class program_113{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("CALCULATOR");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Multiply");
            System.out.println("5. Exit");
            System.out.println();
            System.out.println("Enter choice :- ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter num 1 :- ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter num 2 :- ");
                    int num2 = scanner.nextInt();
                    System.out.println("Num 1 + Num 2 = " + (num1+num2));
                    break;
                case 2:
                    System.out.print("Enter num 1 :- ");
                    int numm1 = scanner.nextInt();
                    System.out.print("Enter num 2 :- ");
                    int numm2 = scanner.nextInt();
                    System.out.println("Num 1 - Num 2 = "+ (numm1-numm2));
                    break;
                case 3:
                    System.out.print("Enter num 1 :- ");
                    int nummm1 = scanner.nextInt();
                    System.out.print("Enter num 2 :- ");
                    int nummm2 = scanner.nextInt();
                    System.out.println("Num 1 / Num 2 = " + (nummm1/nummm2));
                    break;
                case 4:
                    System.out.print("Enter num 1 :- ");
                    int numb1 = scanner.nextInt();
                    System.out.print("Enter num 2 :- ");
                    int numb2 = scanner.nextInt();
                    System.out.println("Num 1 * Num 2 = "+ (numb1*numb2));
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        scanner.close();
    }
}