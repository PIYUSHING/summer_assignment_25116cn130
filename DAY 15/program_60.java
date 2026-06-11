// moving Zeros to end
import java.util.*;
public class program_60{
    public static void moveZero(int arr[]){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        while(j<arr.length){
            arr[j] = 0;
            j = j+1;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
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
            System.out.print(arr[i]+" ");
        }
        moveZero(arr);
        scanner.close();
    }
}