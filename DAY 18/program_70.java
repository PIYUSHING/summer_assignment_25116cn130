import java.util.Scanner;
public class program_70 {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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
        System.out.println("bubble sorted array is:- ");
        selectionSort(arr);
        for(int i=0 ; i<N; i++){
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }
}
