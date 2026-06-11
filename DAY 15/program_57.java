// Reverse array
import java.util.*;
public class program_57{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
            Sytem.out.print(arr[i]);
        }
        System.out.println("reversed array");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}