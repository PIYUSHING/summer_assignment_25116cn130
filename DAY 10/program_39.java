public class program_39 {
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=n; i++){
            int a =1;
            for(int j=1; j<=n; j++){
                if(j > n-i){
                    System.out.print(a++);
                }
                else{
                    System.out.print(" ");
                }
            }
            int b=i-1;
            for(int k=n+1; k<= n+i-1; k++){
                System.out.print(b--);
            }
            System.out.println();
        }
    }
}
