// Binary search
import java.util.Scanner;
public class program_71 {
    public static int binarySearch(int arr[] , int a){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(a > arr[mid]){   
                start = mid + 1;
            }
            else if(a < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
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
        System.out.println("Element to search in the array:- ");
        int a = scanner.nextInt();
        System.out.println("Element found in array at index:- ");
        int index = binarySearch(arr,a);
        System.out.println(index);
        scanner.close();
    }
}
