//strong number
import java.util.*;
public class program_18 {
    public static int factorial(int a){
        int num = 1;
        for(int i=a; i>0; i--){
            num = num *i;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=  scanner.nextInt();
        int n = N;
        int num = 0;
        while(n != 0){
            int a = n%10;
            int fact = factorial(a);
            num = num + fact;
            n = n/10;
        }
        if(num == N){
            System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
    }
}
