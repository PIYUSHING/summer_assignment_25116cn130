// longest word 
import java.util.*;
public class program_95 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = new String[str.length()];
        for(int j=0; j<words.length; j++){
            words[j] = "";
        }
        int[] count = new int[words.length];
        int k = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                words[k] = words[k] + str.charAt(i);
                count[k]++;
            }
            else{
                k++;
            }
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<count.length; i++){
            if(count[i] > max){
                max = count[i];
                index = i;
            }
        }
        System.out.println("largest word :- "+ words[index]);
        scanner.close();
    }
}

