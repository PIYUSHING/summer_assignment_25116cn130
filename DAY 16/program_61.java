// Find missing number in array
import java.util.*;
public class program_61{
    public static void findMissingNumber(int arr[]){
        int a = arr[0];
        int d = Math.min(arr[1]-arr[0], arr[2]-arr[1]);
        int  index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != (a+(i*d))){
                index = i;
                break;
            }
        }
        System.out.println(index);
        int missNum = (a + (index*d));
        System.out.println("The missing no. in array :- "+ missNum);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array :- ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        scanner.close();
        findMissingNumber(arr);
    }
}