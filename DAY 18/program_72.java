import java.util.Scanner;

public class program_72 {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lemgth of the array arr:- ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the arr:- ");
        for(int i=0 ;i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("descending order of array is:- ");
        bubbleSort(arr);
        for(int i=0 ; i<N; i++){
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
