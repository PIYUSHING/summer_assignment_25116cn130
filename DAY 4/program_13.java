// Fibonacci series
import java.util.*;
public class program_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0; i<=N; i++){
            System.out.print(first+" ");
            int curr = first+second;
            second = first;
            first = curr;
        }
    }
}
