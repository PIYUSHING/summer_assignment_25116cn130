//function for Armstrong
import java.util.*;
public class program_46 {
    public static void ifArmstrong(int N){
        int n = N;
        int num =0;
        while(n != 0){
            int a = n%10;
            num = num +(a*a*a);
            n = n/10;
        }
        if(num == N){
            System.out.println(N + " Armstrong");
        }
        else{
            System.out.println(N+" is NOT Armstrong");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        ifArmstrong(N);
    }
}
