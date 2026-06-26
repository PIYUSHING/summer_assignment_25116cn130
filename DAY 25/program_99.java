// Sort names alphabetically
import java.util.*;
public class program_99 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] frqArray = new int[256];
        for(int i=0; i<str.length(); i++){
            frqArray[str.charAt(i)]++;
        }
        for(int i=0; i<256; i++){
            if(frqArray[i] > 0) System.out.print((char)i);
        }
        scanner.close();
    }
}
