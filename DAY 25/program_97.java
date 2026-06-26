// merge two sorted arrays
import java.util.*;
public class program_97 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arr1 length :- ");
        int N = scanner.nextInt();
        int[] arr1 = new int[N];
        System.out.println("Enter elements of arr1 :- ");
        for(int i=0; i<N; i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter arr2 length :- ");
        int N2 = scanner.nextInt();
        int[] arr2 = new int[N2];
        System.out.println("Enter elements of arr2 :- ");
        for(int i=0; i<N2; i++){
            arr2[i] = scanner.nextInt();
        }
// solved by value-tracking
        // int[] mergedArray = new int[N+N2];
        // int i =0;
        // int j = 0;
        // int k = 0;
        // int first = 0;
        // int last = 0;
        // if(arr1[N-1] > arr2[N2-1]){
        //     last = arr1[N-1];
        // }
        // else{
        //     last = arr2[N2-1];
        // }
        // while(first < last){
        //     int val1 = (i<N)? arr1[i] : Integer.MAX_VALUE;
        //     int val2 = (j<N2)? arr2[j] : Integer.MAX_VALUE;
        //     if(val1 <= val2){
        //         first = val1;
        //         i++;
        //     }
        //     else{
        //         first = val2;
        //         j++;
        //     }
        //     mergedArray[k] = first;
        //     k++;
        // }
        // if(i < N) mergedArray[k] =arr1[i];
        // if(j <N2) mergedArray[k] = arr2[j];

        //solved by index tracking
        int[] mergedArray = new int[N+N2];
        int i =0, j=0, k=0;
        while(i <N && j<N2){
            if(arr1[i] <= arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
            }
            else{
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<N){
            mergedArray[k] = arr1[i];
            i++; k++;
        }
        while(j<N2){
            mergedArray[k] = arr2[j];
            j++; k++;
        }

        for(int q=0; q<mergedArray.length; q++){
            System.out.print(mergedArray[q]+" ");
        }
        scanner.close();
    }
}
