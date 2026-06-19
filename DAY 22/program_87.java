// Character frequency
import java.util.*;
public class program_87 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] arrayASCII = new int[256];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arrayASCII[ch]++;
        }
        for(int i=0; i<256; i++){
            if(arrayASCII[i] > 0){
                System.out.println((char)i + " frequency :- "+ arrayASCII[i]);
            }
        }
        scanner.close();
    }
}
