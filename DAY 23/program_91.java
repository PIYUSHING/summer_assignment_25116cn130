import java.util.*;
public class program_91{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();
        if(str1.length() != str2.length()){
            System.out.println("not anagrams");
            return;
        }
        int[] freqArray1 = new int[256];
        int[] freqArray2 = new int[256];
        for(int i=0; i<str1.length(); i++){
            freqArray1[str1.charAt(i)]++;
        }
        for(int i=0; i<str2.length(); i++){
            freqArray2[str2.charAt(i)]++;
        }
        boolean isAnagram = true;
        for(int i=0; i<256; i++){
            if(freqArray1[i] != freqArray2[i]){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println(str1 + " and " + str2 +" are anagrams");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
}
