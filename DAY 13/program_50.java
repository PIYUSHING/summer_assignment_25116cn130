//sum and average of array
import java.util.*;
public class program_50 {
    public static int arraySum(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int arrayAvg(int arr[]){
        int average = arraySum(arr)/2;
        return average;

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
        int sum = arraySum(arr);
        System.out.println("sum of the elements of the array:- "+ sum);
        int average = arrayAvg(arr);
        System.out.println("average of the elements of the array:- "+ average);
        scanner.close();
    }
}
