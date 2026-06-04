//Reverse a number. 
import java.util.Scanner;
public class program_6 {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int num = 0;
        while(N>0){
            int a = N%10;
            num = num*10 + a;
            N = N/10;
        }
        System.out.println(num);
    }
}
