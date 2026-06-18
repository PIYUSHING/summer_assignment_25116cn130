// Merge arrays
import java.util.*;
public class program_65{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Array 1 :- ");
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        System.out.println("input elements of the Array 1");
        for(int i=0; i<N; i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the length of the Array 2 :- ");
        int N2 = scanner.nextInt();
        int[] arr2 = new int[N2];
        System.out.println("input elements of the Array 2");
        for(int i=0; i<N2; i++){
            arr2[i] = scanner.nextInt();
        }
        int[] mergeArray = new int[N + N2];
        int k = 0;
        for(int i=0; i<(N+N2); i++){
            if(i < N){
                mergeArray[i] = arr1[i];
            }
            else{
                mergeArray[i] = arr2[k];
                k++;
            }
        }
        for(int i=0; i<mergeArray.length; i++){
            System.out.print(mergeArray[i]+" ");
        }
        scanner.close();
    }
}