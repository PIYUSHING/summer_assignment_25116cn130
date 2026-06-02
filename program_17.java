// perfect number
import java.util.*;
public class program_17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N/2;
        int num= 0;
        for(int i=1; i<=q; i++){
            if(N%i == 0){
                num = num + i;
            }
        }
        if(num == N){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
