import java.util.*;
public class program_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        for(int i=N1; i<=N2; i++){
            int prime = 0;
            if(i == 1){
                prime = 1;
            }
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    prime = 1;
                }
            }
            if(prime == 0){
                System.out.println(i);
            }
        }
    }
}
