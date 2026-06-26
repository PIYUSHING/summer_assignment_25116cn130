// maximum occuring character 
import java.util.*;
public class program_92{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] charArray = new int[256];
        for(int i=0; i<str.length(); i++){
            charArray[str.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        int ch = 0;
        for(int i=0; i<256; i++){
            if(charArray[i] > max){
                max = charArray[i];
                ch = i;
            }
        }
        System.out.println((char)ch);
        scanner.close();
    }
}