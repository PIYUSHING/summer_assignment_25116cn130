// multiplication table of a given number. 
import java.util.*;
public class program_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        for(int i=1; i<=10; i++){
            int mul = N*i;
            System.out.println(N + "X" + i + "=" + mul);
        }
    }
}
