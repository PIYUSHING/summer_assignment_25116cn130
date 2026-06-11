// linear search
import java.util.*;
public class program_53{
    public static void linearSearch(int arr[], int n){
         int found = 0;
        int ind =0;
        for(int i=0; i<arr.length; i++){
            if(n == arr[i]){
                found = 1;
                ind = i;
                break;
            }
        }
        if(found == 0){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index :- "+ind);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter the number to search :- ");
        int n = scanner.nextInt();
        linearSearch(arr, n);
        scanner.close();
    }
}