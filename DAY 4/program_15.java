//Armstrong numbers
import java.util.*;
public class program_15{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = N;
        int num = 0;
        while(N > 0){
            int a = N%10;
            num = num + a*a*a;
            N = N/10;
        }
        if(num == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not an Armstrong");
        }
    }
}
