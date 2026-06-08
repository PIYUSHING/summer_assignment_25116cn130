// Write function to find maximum. 
import java.util.*;
public class program_42 {
    public static void compareMax(int N1, int N2){
        if(N1 > N2){
            System.out.println(N1 + " is maximum");
        }else{
            System.out.println(N2 +" is maximum");
        }
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        scanner.close();
        compareMax(N1,N2);
    }
}
