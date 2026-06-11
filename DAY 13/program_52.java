import java.util.Scanner;
public class program_52 {
    public static int countEven(int arr[]){
        int even = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even++;
            }
        }
        return even;
    }
    public static int countOdd(int arr[]){
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                odd++;
            }
        }
        return odd;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array length");
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("enter the numbers :- "+ i);
            arr[i] = scanner.nextInt();
        }
        int even = countEven(arr);
        System.out.println("even numbers :- "+even);
        int odd = countOdd(arr);
        System.out.println("Odd numabers :- "+odd);
        scanner.close();
    }
}
