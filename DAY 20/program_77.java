import java.util.*;
public class program_77{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int[][] mat1 = new int[N1][N2];
        System.out.println("Enter the elements of the mat1 :- ");
        for(int i=0; i<N1; i++){
            for(int j= 0; j<N2; j++){
                mat1[i][j] = scanner.nextInt();
            }
        }
        int[][] mat2 = new int[N1][N2];
        System.out.println("Enter the elements of the mat2 :- ");
        for(int i=0; i<N1; i++){
            for(int j= 0; j<N2; j++){
                mat2[i][j] = scanner.nextInt();
            }
        }

        // multiplying the matrices 
        int[][] newMat = new int[N1][N2];
        for(int i=0 ; i<N1; i++){
            for(int j=0; j<N2; j++){
                newMat[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
        
        for(int i=0; i<N1; i++){
            for(int j=0; j<N2; j++){
                System.out.print(newMat[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
