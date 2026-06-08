// function to find sum of two numbers. 
import java.util.*;
public class program_41{
    public static int numSum(int N1, int N2){
        int s = N1+N2;
        return s;
    }
    public static void main(String[] srga){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int sum = numSum(N1,N2);
        System.out.println(sum);
    }
}