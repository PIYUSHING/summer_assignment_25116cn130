// function to find factorial.
import java.util.*; 
public class program_44 {
    public static int numFactorial(int N){
        int fact = 1;
        for(int i=N; i>0; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int fact = numFactorial(N);
        System.out.println(fact);
        scanner.close();
    }
}
