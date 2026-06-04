//nth Fibonacci term. 
import java.util.Scanner;
public class program_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int first = 0;
        int second = 1;
        for(int i=1; i<=N; i++){
            int curr = first+second;
            second = first;
            first = curr;
        }
        System.out.println(second);
    }
}
