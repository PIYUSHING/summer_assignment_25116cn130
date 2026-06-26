import java.util.*;
public class program_90{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] freqArray = new int[256];
        for(int i=0; i<str.length(); i++){
            freqArray[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(freqArray[str.charAt(i)] > 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
        scanner.close();
    }
}