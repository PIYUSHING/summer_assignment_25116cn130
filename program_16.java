//Armstrong numbers in a range.
import java.util.Scanner;
public class program_16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        for(int i=N1; i<=N2; i++){
            int n = i;  
            int b = i;
            int num = 0;
            while(n > 0){
                int a = n%10;
                num = num + a*a*a;
                n = n/10;
            }
            if(b == num){
                System.out.println(b);
            }
        }
    }
}
