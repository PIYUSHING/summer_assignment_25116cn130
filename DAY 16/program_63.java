//pair with given sum
import java.util.Scanner;
public class program_63 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array :- ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter sum :- ");
        int sum = scanner.nextInt();
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println("{"+arr[i]+","+arr[j]+"}");
                }
            }
        }
        scanner.close();
    }
}
