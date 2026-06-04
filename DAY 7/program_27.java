//Recursive sum of digits
import java.util.*;
public class program_27{
    public static int digitSum(int N){
        if(N == 0){ 
            return 0;
        }
        return (N%10)+ digitSum(N/10);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = digitSum(N);
        System.out.println(sum);
    }
}