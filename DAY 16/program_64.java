// Remove duplicates from array
import java.util.Scanner;
public class program_64 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array :- ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }
        int newArray[] = new int[N];
        int k = 0;
        for(int i=0; i<N; i++){
            int isTrue = 0;
            for(int j=i+1; j<N; j++){
                if(arr[i] == arr[j]){
                    isTrue = 1;
                    break;
                }
            }
            if(isTrue == 0){
                newArray[k] = arr[i];
                k++;
            }
        }
        for(int i=0; i<k; i++){
            System.out.print(newArray[i]+" ");
        }
        scanner.close();
    }
}
