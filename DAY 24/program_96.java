// Remove duplicate characters
import java.util.*;
public class program_96 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] freqStr = new int[256];
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            freqStr[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(freqStr[str.charAt(i)] > 0){
                newStr = newStr + str.charAt(i);
                freqStr[str.charAt(i)] = 0;
            }
        }
        System.out.println(newStr);
        scanner.close();
    }
}
