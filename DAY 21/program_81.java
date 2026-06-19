//String length
import java.util.*;
public class program_81{
    public static int stringLength(String str){
        int length = 0;
        for(int i=0; i<str.length(); i++){
            length++;
        }
        return length;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str);
        int length = stringLength(str);
        System.out.println("Length of the string Entered is:- "+ length);
        scanner.close();
    }
}