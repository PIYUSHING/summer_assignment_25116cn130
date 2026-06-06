//reverse pyramid
public class program_38 {
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=1; j<= 2*n-1; j++){
                if(j >= i+1 && j <= (2*n-1)-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
