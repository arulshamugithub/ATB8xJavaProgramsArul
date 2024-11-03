package Oct.ex_25102024_Arrays;

public class Lab191_2DArray_Iteration {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{6,7,8}};

        for(int i=0;i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length;j++ ){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
