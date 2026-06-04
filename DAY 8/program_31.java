// Print character triangle
public class program_31 {
    public static void main(String[] args){
        char[] arr = {'A','B','C','D','E'};
        for(int i =1; i<=arr.length ; i++){
            for(int j = 0; j<i; j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
