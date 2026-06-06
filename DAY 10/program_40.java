public class program_40 {
    public static void main(String[] args){
        int n =5;
        for(int i=1; i<=n; i++){
            char a = 'A';
            for(int j=0; j<n ; j++){
                if(j >= n-i){
                    System.out.print(a++);
                }
                else{
                    System.out.print(" ");
                }
            }
            char b = (char) ('A' +(i-2));
            for(int k=n+1; k<=n+i-1; k++){
                System.out.print(b--);
            }
            System.out.println();
        }
    }
}
