// function for perfect number
import java.util.*;
public class progran_48 {
    public static void isPerfect(int N){
        int q = N/2;
        int num = 0;
        for(int i=1; i<=q; i++){
            if(N%i == 0){
                num = num + i;
            }
        }
        if(num == N){
            System.out.println(N+" is Perfect number");
        }
        else{
            System.out.println(N+" not a Perfect number");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        isPerfect(N);
    } 
}
