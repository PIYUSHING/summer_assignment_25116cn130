import java.util.Scanner;
public class program_12{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int num1 = 0;
        int num2 = 0;
        int hcf = 0;
        if(N1 > N2){
            num1 = N2;
            num2 = N1;
        }
        else{
            num1 = N1;
            num2 = N2;
        }
        for(int i=num1; i>0; i--){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
                break;
            }
        }
        int lcm =(N1*N2)/hcf;
        System.out.println(lcm);
    }
}