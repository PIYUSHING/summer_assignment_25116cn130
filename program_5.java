// sum of digits of a number. 
import java.util.Scanner;
public class program_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int sum = 0;
        while(N>0){
            int a = N%10;
            sum = sum + a;
            N = N/10;
        }
        System.out.println(sum);
    }
}
