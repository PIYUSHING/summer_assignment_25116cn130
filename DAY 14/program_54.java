//program to Frequency of an element.
import java.util.Scanner;
public class program_54 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("numbers to find frequency :- ");
        int num = scanner.nextInt();
        int fre = 0;
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                fre++;
            }
        }
        System.out.println("Frequency of the "+num+ "  is :- "+fre);
        scanner.close();
    }
}
