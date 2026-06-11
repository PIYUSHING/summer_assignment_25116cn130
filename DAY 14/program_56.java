// Find duplicates in array
import java.util.*;
public class program_56{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            for(int j=i+1; i<arr.length; j++){
                if(arr[j] == a){
                    System.out.println("duplicate at "+ j);
                }
            }
        }
        scanner.close();
    }
}