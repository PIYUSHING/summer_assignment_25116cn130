// product of digits
import java.util.Scanner;
public class program_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int mul = 1;
        while(N>0){
            int a = N%10;
            mul = mul*a;
            N = N/10;
        }
        System.out.println(mul);
    }
}
