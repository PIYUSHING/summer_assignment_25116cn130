// //Rotate array left
// import java.util.*;
// public class program_58{
//     public static void rotateArrayLeft(int arr[], int rotate){
//         for(int i=0; i< rotate; i++){
//             int first = arr[0];
//             for(int j=0; j<arr.length-1; j++){
//                 arr[j] = arr[j+1];
//             }
//             arr[arr.length-1] = first; 
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]);
//         }
//     }
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("input the array length");
//         int N = scanner.nextInt();
//         int arr[] = new int[N];
//         for(int i=0; i<N; i++){
//             System.out.println("enter the numbers :- "+ i);
//             arr[i] = scanner.nextInt();
//             System.out.print(arr[i]);
//         }
//         int rotate = scanner.nextInt();
//         System.out.println("Rotate by :- "+ rotate);
//         rotateArrayLeft(arr, rotate);
//     }
// }

// we acn also rotate an array by using anther array temp[]
//Rotate array left
import java.util.*;
public class program_58{
    public static void rotateArrayLeft(int arr[], int rotate){
        int[] temp = new int[arr.length];
        int l = arr.length;
        rotate = rotate%l;
        for(int i=0 ; i<n; i++){
            temp[i] = arr[(i+rotate)%l];
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(temp[i]);
        }
    }
    public static void main(String[] args){
        
        int rotate = scanner.nextInt();
        System.out.println("Rotate by :- "+ rotate);
        rotateArrayLeft(arr, rotate);
    }
}