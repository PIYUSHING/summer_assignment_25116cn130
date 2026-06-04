// Print factors of a number
import java.util.*;
public class program_19 {
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i<=N/2; i++){
            if(N%i == 0){
                System.out.println(i);
            }
        }
    }
}
