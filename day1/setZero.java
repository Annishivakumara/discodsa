public class setmatrix {
    public static void setzero(int [][]matrix){
        if(matrix == null || matrix.length == 0){
            System.out.println("Matrix is Empty");
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    markrow(matrix, i);
                    markcol(matrix, j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        }

  private static void markrow(int [] [] matrix , int row){
    for(int j=0;j<matrix[0].length;j++){
        if(matrix[row][j]!=0){
            matrix[row][j]=-1;
        }
    }
  }

    private static void markcol(int[][] matrix, int col){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][col] != 0){
                matrix[i][col] = -1;
            }
        }
    }

    public static void main(String[] args){
        int[][] mat = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {1, 1, 1, 1}
        };
        setzero(mat);
        System.out.println("Matrix after setting zeros:");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
