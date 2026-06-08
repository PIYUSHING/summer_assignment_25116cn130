import java.util.*;
public class program_47{
    public static int numFibonacci(int N){
        if(N == 1){ 
            return 0;
        }
        if(N == 2){
            return 1;
        }
        return numFibonacci(N-1)+numFibonacci(N-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int fibo = numFibonacci(N);
        System.out.println(fibo);
    }
}