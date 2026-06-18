// Union of arrays
import java.util.Scanner;
public class program_66{
    public static void arrayUnion(int arr1[] , int arr2[]){
        for(int i=0; i<arr1.length; i++){
            boolean duplicates = false;
            for(int j=0; j<i; j++){
                if(arr1[i] == arr1[j]){
                    duplicates = true;
                    break;
                }
            }
            if(!duplicates){
                System.out.print(arr1[i]+" ");
            }
        }
        for(int i=0; i<arr2.length; i++){
            boolean found = false;
            for(int j=0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(arr2[i]+" ");
            }
        }
    }
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
        arrayUnion(arr1,arr2);
        scanner.close();
    }
}