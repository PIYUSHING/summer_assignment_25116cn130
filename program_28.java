//Recursive reverse number
import java.util.*;
public class program_28{
    public static int numReverse(int N, int rev){
        if(N == 0){
            return rev;
        }
        rev = rev*10 + N%10;
        return numReverse(N/10, rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = numReverse(N,0);
        System.out.println(reverse);
    }
}