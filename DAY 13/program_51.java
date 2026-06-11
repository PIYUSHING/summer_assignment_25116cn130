// largest and smallest element
import java.util.Scanner;
public class program_51 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
        }
        int minValue = Integer.MIN_VALUE;
        int maxValue =Integer.MAX_VALUE;;
        for(int i=0; i<N; i++){
            if(arr[i] > minValue){
                minValue = arr[i];
            }
            if(arr[i] < maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Maximum number:- "+ minValue);
        System.out.println("Minimum number:- "+ maxValue);
        scanner.close();
    }
}
