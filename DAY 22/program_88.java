// Remove spaces from string
import java.util.*;
public class program_88 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(newStr);
        scanner.close();
    }
}
