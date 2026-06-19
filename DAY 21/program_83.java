// Count vowels and consonants
import java.util.*;
public class program_83 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<str.length(); i++){
            boolean isVowel = false;
            for(int j=0; j<vowels.length; j++){
                if(str.charAt(i) == vowels[j]){
                    isVowel = true;
                    break;
                }
            }
            if(isVowel){
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }
        scanner.close();
        System.out.println("Count of vowels in the Str :- "+ vowelCount);
        System.out.println("Count of consonant int the Str :- "+ consonantCount);
    }
}
