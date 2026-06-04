import java.util.*;
public class program_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<=N; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}