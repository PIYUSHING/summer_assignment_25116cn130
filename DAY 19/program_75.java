// transpose of the matrix
import java.util.*;
public class program_75 {
    public static void matTranspose(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int[][] mat = new int[N1][N2];
        System.out.println("Enter the elements of the mat :- ");
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        matTranspose(mat);
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
