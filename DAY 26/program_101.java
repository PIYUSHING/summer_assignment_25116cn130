import java.util.Random;
import java.util.Scanner;
public class program_101{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessNum = scanner.nextInt();
        int randomNum = random.nextInt(100)+1;
        int count = 0;
        while(guessNum != randomNum){
            if(guessNum < randomNum){
                System.out.println("higher");
            }
            else{
                System.out.println("lower");
            }
            count++;
            guessNum = scanner.nextInt();
        }
        System.out.println("correct guess :- "+ randomNum);
        System.out.println("attempts :- " + count);
        scanner.close();
    }
}