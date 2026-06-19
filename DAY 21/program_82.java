// Reverse a string
import java.util.*;
public class program_82 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str =  scanner.next();
        String newStr = "";
        for(int i=str.length()-1; i>=0; i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
        scanner.close();
    }
}
