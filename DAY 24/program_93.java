// Check string rotation
import java.util.*;
public class program_93{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("not matched");
        }
        int l = str1.length();
        boolean isMatched = false;
        for(int i=1; i<l; i++){
            String newStr = "";
            int rotate = i;
            for(int j=0; j<l; j++){
                newStr = newStr + str1.charAt((rotate+j)%l);
            }
            if(newStr.equals(str2)){
                isMatched = true;
                break;
            }
        }
        if(isMatched){
            System.out.println("matched");
        }
        else{
            System.out.println("not matched");
        }
        scanner.close();

        // Optimized Approach
        // if((str1+str2).contains(str2)){
        //     System.out.println("matched");
        // }
        // else{
        //     System.out.print("not matched");
        // }
    }
}