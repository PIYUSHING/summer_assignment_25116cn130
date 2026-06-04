import java.util.Scanner;

public class program_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int factorial = 1;
        for(int i=N; i>0; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
