// Recursive Fibonacci
import java.util.*;
public class program_26 {
    public static int fibonacci(int N){
       if(N == 1){
        return 1;
       }
       if(N == 0){
        return 0;
       }
       return fibonacci(N-1)+fibonacci(N-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = fibonacci(N);
        System.out.println(num);
    }
}
