// x^n without pow()
import java.util.*;
public class program_24 {
    public static int numPower(int base,int power){
        int num = 1;
        for(int i=1 ; i<=power; i++){
            num = num *base;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        int base = scanner.nextInt();
        System.out.print("power: ");
        int power = scanner.nextInt();
        int num = numPower(base,power);
        System.out.println(num);;
    }
}
