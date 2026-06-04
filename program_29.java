// half pyramid pattern
public class program_29{
    public static void main(String[] args){
        int N = 5;
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}