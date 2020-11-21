package sde_questions.arrays;

//given matrix..
//find the transpose
public class rotateTheMatrix {

    public static int[][] rotate(int[][] matrix){
        int n = matrix.length;

        //first will transpose
        for(int i =0; i<n; i++){
            for (int j = i;j<n;j++){
               int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j =i; j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix;
    }



}
