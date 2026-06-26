// Compress a string

import java.util.*;
public class program_94 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str + " ";
        String str2 = "";
        int j = 0;
        for(int i=0; i<str.length()-1; i++){
            char current = str.charAt(i);
            char next = str.charAt(i+1);
            if(current != next){
                str2 = str2 + current + (j+1) ;
                j = 0;
            }
            else{
                j++;
            }
        } 
        System.out.println(str2);
        scanner.close();
    }
}
