// menu-driven string operations system
import java.util.Scanner;
public class program_115 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("===== String Operations =====");
            System.out.println("1. Is Palindrome");
            System.out.println("2. Reverse String");
            System.out.println("3. Compare two Strings");
            System.out.println("4 String length");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter Choice :- ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    String str = scanner.next();
                    String newStr = "";
                    int i = str.length();
                    for(int j=i-1; j>=0; j--){
                        newStr = newStr + str.charAt(j);
                    }
                    if(newStr.equals(str)){
                        System.out.println("String is Palindrome");
                    }
                    else{
                        System.out.println("Not a Palindrome");
                    }
                    break;
                case 2:
                    String strr = scanner.next();
                    String newStrr = "";
                    int k = strr.length();
                    for(int j=k-1; j>=0; j--){
                        newStrr = newStrr + strr.charAt(j);
                    }
                    System.out.println(newStrr);
                    break;
                case 3:
                    String str1 = scanner.next();
                    String str2 = scanner.next();
                    if(str1.equals(str2)){
                        System.out.println("Strings are Equal");
                    }
                    else{
                        System.out.println("Unequal Strings");
                    }
                    break;
                case 4:
                    String string = scanner.next();
                    int j = 0;
                    for(char c : string.toCharArray()){
                        j++;
                    }
                    System.out.println("String Length :- " + j);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        scanner.close();
    } 
}
