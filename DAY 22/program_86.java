//Count words in a sentence
import java.util.*;
public class program_86 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        int spaces = 0;
        int a = 0;
        for(int j=0; j<str.length(); j++){
            if(str.charAt(j) != ' '){
                a = j;
                break;
            }
        }
        for(int i=a; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                spaces++;
            }
            if(i == str.length()-1){
                spaces++;
            }
        }
        System.out.println("Numbers of words string:- "+ spaces);
        scanner.close();
    }
}
