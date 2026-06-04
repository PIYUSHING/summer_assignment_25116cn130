// Decimal --> Binary
import java.util.*;
public class program_21 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        int N = scanner.nextInt();
        int n = N;
        int binary = 0;
        int place = 1;
        while(n != 0){
           int rem = n%2;
           binary = binary + rem*place;
           place = place*10;
           n = n/2;
        }
        System.out.println(binary);
    }
}
