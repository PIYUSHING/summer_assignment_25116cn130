// Sort words by length
import java.util.*;
public class program_100 {
    public static void sortLength(String str){
        int l = 1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                l++;
            }
        }
        int[] wordLength = new int[l];
        String[] strLen = new String[l];
        for(int i=0; i<l; i++){
            strLen[i] = "";
        }
        int k = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                strLen[k] = strLen[k] + str.charAt(i);
                wordLength[k]++;
            }
            else{
                k++;
            }
        }
        for(int i=0; i<l-1; i++){
            for(int j=0; j<l-1-i; j++){
                if(wordLength[j+1] > wordLength[j]){
                    int temp = wordLength[j];
                    wordLength[j] = wordLength[j+1];
                    wordLength[j+1] = temp;

                    String s = strLen[j];
                    strLen[j] = strLen[j+1];
                    strLen[j+1] = s;
                }
            }
        }
        for(int i=0; i<l; i++){
            System.out.print(strLen[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        sortLength(str);
        scanner.close();
    }
}
