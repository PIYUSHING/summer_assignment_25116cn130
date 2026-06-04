import java.util.Scanner;

public class program_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int n = N;
        int num = 0;
        while(n>0){
            int a = n%10;
            num = num*10 + a;
            n = n/10;
        }
        if(N == num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
