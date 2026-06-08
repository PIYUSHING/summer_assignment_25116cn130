//function to check prime.
import java.util.*; 
public class program_43 {
    public static void isPrime(int N){
       int isPrime = 1;
       for(int i=2; i<N; i++){
            if(N%i == 0){
                isPrime = 0;
                break;
            }
        }
        if(isPrime == 1){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        isPrime(N);
    }
}
