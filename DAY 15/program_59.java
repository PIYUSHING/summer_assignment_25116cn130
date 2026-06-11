//rotate Array Right
import java.util.*;
public class program_59{
    public static void rotateArrayRight(int arr[], int rotate){
        int[] temp = new int[arr.length];
        int l = arr.length;
        rotate = rotate % l;
        for(int i=0; i<l; i++){
            temp[(i+rotate)%l] = arr[i];
        }
        for(int i=0; i<l; i++){
            System.out.print(temp[i]+" ");
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
        int rotate = scanner.nextInt();
        System.out.println("Rotate by :- "+ rotate);
        rotateArrayRight(arr,rotate);
        scanner.close();
    }
}