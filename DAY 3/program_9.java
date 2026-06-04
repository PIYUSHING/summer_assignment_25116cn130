// a number is prime. 
import java.util.*;
public class program_9{
    public static void main(String[] args){
        int prime = 0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=2; i<N; i++){
            if(N%i == 0){
                prime = 1;
            }
        }
        if(prime == 0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
}