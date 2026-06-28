//create vote eligibility system.
import java.util.Scanner;
public class program_102 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isTrue = (age>=18)? true : false;
        if(isTrue == true)System.out.println("eligible to vote");
        else System.out.println("Not eligible to vote");
        scanner.close();
    }
}
