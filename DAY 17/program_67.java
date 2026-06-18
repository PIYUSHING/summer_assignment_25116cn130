// Intersection of arrays
import java.util.Scanner;
public class program_67 {
    public static void arrayIntersection(int arr1[] , int arr2[]){
        for(int i=0; i<arr1.length; i++){
            boolean duplicates = false;
            for(int j=0; j<i; j++){
                if(arr1[i] == arr1[j]){
                    duplicates = true;
                    break;
                }
            }
            boolean found = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!duplicates && found){
                System.out.print(arr1[i]+" ");
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
        System.out.println("Intersection of arr1 and arr2 is:- ");
        arrayIntersection(arr1,arr2);
        scanner.close();
    }
}
