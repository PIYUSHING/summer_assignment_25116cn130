// Symmetric matrix
import java.util.*;
public class program_77{
    public static void transposeMat(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat[0].length; j++){
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
        if(N1 != N2){
            System.out.println("Matrix is not symmetric ");
            return;
        }
        System.out.println("Enter the elements of the mat:- ");
        int[][] mat = new int[N1][N2];
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        int[][]newMat = new int[N1][N2];
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
                newMat[i][j] = mat[i][j];
            }
        }
        transposeMat(newMat);
        boolean isSymmetric = true;
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
               if( mat[i][j] != newMat[i][j]){
                    isSymmetric = false;
                    break;
               }
            }
        }
        if(isSymmetric){
            System.out.println("the given matrix is symmetric");
        }
        else{
            System.out.println("the given matrix is NOT symmetric");
        }
    }
}