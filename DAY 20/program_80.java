// column wise sum
import java.util.*;
public class program_80{
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
        for(int i=0; i<mat[0].length; i++){
            int sum = 0;
            for(int j=0; j<mat.length; j++){
                sum = sum + mat[j][i];
            }
            System.out.println("Sum of the Column "+i+" :- "+ sum);
        }
        scanner.close();
    }
}