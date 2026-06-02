// Count set bits in a number
import java.util.*;
public class program_23 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = 0;
        while(N != 0){
            int a = N%2;
            if(a == 1){
                num++;
            }
            N = N/2;
        }
        System.out.println(num);
    }
}
