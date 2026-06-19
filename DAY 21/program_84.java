//Convert lowercase to uppercase
import java.util.*;
public class program_84{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String lowerStr = scanner.next();
        for(int i=0; i<lowerStr.length(); i++){
            char upperChar = Character.toUpperCase(lowerStr.charAt(i));
            System.out.print(upperChar);
        }
        System.out.println();
        String upperStr = lowerStr.toUpperCase();
        System.out.println(upperStr);
        scanner.close();
    }
}