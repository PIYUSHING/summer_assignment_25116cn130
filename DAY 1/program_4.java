// Count digits in a number. 
import java.util.Scanner;
public class program_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int digits = 0;
        while(N>0){
            N = N/10;
            digits++;
        }
        System.out.println(digits);

    }
}
