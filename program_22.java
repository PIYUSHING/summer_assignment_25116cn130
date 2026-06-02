//Binary --> Decimal
import java.util.*;
public class program_22{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 0;
        int i = 0;
        while(N != 0){
            int a = N%10;
            num = (int) (num + a*Math.pow(2,i));
            i = i+1;
            N = N/10;
        }  
        System.out.println(num);
    }
}
