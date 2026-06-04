// Recursive factorial
import java.util.*;
public class program_25{
    public static int numFactorial(int N){
        if(N == 0 || N == 1){
            return 1;
        }
        int num = N*numFactorial(N-1);
        return num;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int fact = numFactorial(N);
        System.out.println(fact);
    }
}