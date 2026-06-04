// largest prime factor
import java.util.Scanner;
public class program_20{
    public static int isPrime(int i){
        int prime = 1;
        if(i <= 1){
            return 0;
        }

        for(int j=2; j<i; j++){
            if(i%j == 0){
                prime = 0;
            }
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 0;
        for(int i = 1; i<=N/2; i++){
            if(N%i == 0){
                int n = isPrime(i);
                if(n == 1){
                    num = i;
                }
            }
        }
        System.out.println(num);
    }
}
