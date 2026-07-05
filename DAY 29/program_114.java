// menu-driven array operations system
import java.util.Scanner;
public class program_114 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Arrya length :- ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the Elements :- ");
        for(int i=0; i<length; i++){
            arr[i] = scanner.nextInt();
        }
        boolean running = true;
        while(running){
            System.out.println("Array Operations");
            System.out.println("1. Display Array");
            System.out.println("2. Elements Sum");
            System.out.println("3. MAX Element");
            System.out.println("4. MIN Element");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter choice :- ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    for(int i=0; i<arr.length; i++){
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int sum = 0;
                    for(int i=0; i<arr.length; i++){
                        sum = sum +arr[i];
                    }
                    System.out.println("Sum :- " + sum);
                    break;
                case 3:
                    int min = Integer.MIN_VALUE;
                    for(int i=0; i<arr.length; i++){
                        if(arr[i] > min){
                            min = arr[i];
                        }
                    }     
                    System.out.println("MAX Element :- "+ min );
                    break;
                case 4:
                    int max = Integer.MAX_VALUE;
                    for(int i=0; i<arr.length; i++){
                        if(arr[i] < max){
                            max = arr[i];
                        }
                    }      
                    System.out.println("MIN Element :- "+ max);
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
