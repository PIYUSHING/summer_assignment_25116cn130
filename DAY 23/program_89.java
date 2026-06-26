// first non-repeating character
import java.util.*;
public class program_89{
    // public static void main(String[] args){
    //     Scanner scanner = new Scanner(System.in);
    //     String str = scanner.nextLine();
    //     for(int i=0; i<str.length(); i++){
    //         boolean isRepeating = false;
    //         for(int j=0; j<str.length(); j++){
    //             if(i != j && str.charAt(i) == str.charAt(j)){
    //                 isRepeating = true;
    //                 break;
    //             }
    //         }
    //         if(!isRepeating){
    //             System.out.println(str.charAt(i));
    //             break;
    //         }
    //     }
    //     scanner.close();
    // }

    // it can also be done by frequency Array for better time complexity
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] freqArray = new int[256];
        for(int i=0; i<str.length(); i++){
            freqArray[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(freqArray[str.charAt(i)] == 1){
                System.out.println("first non-repeating character :- "+ str.charAt(i));
                break;
            }
        }
        scanner.close();
    }
}