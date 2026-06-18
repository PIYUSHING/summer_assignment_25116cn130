// maximum frequency element
import java.util.Scanner;
public class program_62 {
    public static int maxFreqNum(int arr[]){
        int num = 0;
        int fre = 0;
        for(int i=0; i<arr.length; i++){
            int fre_j =1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    fre_j++;
                }
            }
            if(fre_j > fre){
                fre = fre_j;
                num = arr[i];
            }
        }
        return num;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array :- ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int freq = maxFreqNum(arr);
        System.out.println("Most frequent number is:- "+ freq);
    }
}
