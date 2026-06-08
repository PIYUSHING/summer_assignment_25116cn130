// function for palindrome
import java.util.*;
public class program_45{
    public static void isPalindrome(int N){
        int n = N;
        int num = 0;
        while(n != 0){
            int a = n%10;
            num = num*10 + a;
            n = n/10;
        }
        if(num == N){
            System.out.println("number is Plaindrome");
        }
        else{
            System.out.println("number in NOT Palindrome");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        isPalindrome(N);
    }
}