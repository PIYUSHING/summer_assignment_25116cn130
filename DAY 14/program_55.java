//Second largest element
import java.util.*;
public class program_55{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max; 
                max = arr[i];
            }
            else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        scanner.close();
        System.out.println("Second maximum element of array :- "+ secMax);
    }
}