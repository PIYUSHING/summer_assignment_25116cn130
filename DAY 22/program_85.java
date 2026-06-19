//palindrome string
import java.util.*;
public class program_85{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String newStr = "";
        for(int i = str.length() - 1; i>=0; i--){
            newStr = newStr + str.charAt(i);
        }
        if(newStr.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}