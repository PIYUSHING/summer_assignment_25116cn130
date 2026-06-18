// Row wise sum
import java.util.*;
public class program_79{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        System.out.println("Enter the elements of the mat:- ");
        int[][] mat = new int[N1][N2];
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<mat.length; i++){
            int sum = 0;
            for(int j=0; j<mat[0].length; j++){
                sum = sum + mat[i][j];
            }
            System.out.println("Sum of the Row "+i+" :- "+ sum);
        }
        scanner.close();
    }
}