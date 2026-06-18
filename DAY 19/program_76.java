// sum of diagonals of the matrix
import java.util.Scanner;
public class program_76 {
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
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(i == j){
                    sum = sum + mat[i][j];
                }
            }
        }
        System.out.println("sum of the elements of the matrix is :- "+ sum);
        scanner.close();
    }
}
