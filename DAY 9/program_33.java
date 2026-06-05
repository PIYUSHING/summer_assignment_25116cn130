// reverse star pattern
public class program_33 {
    public static void main(String[] args){
        int N = 5;
        for(int i=0; i<N; i++){
            for(int j=N; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
