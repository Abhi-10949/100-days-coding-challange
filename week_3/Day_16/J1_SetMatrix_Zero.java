
public class J1_SetMatrix_Zero {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean firstRow = false;
        boolean firstCol = false;

        for(int i = 0;i<m ;i++){
            if(matrix[i][0]==0) firstCol = true;
        }
        for(int j = 0;j<n;j++){
            if(matrix[0][j]==0) firstRow = true;
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] =0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i =1;i< m;i++) {
            for(int j =1;j< n;j++) {
                if(matrix[i][0]== 0 || matrix[0][j]== 0) {
                    matrix[i][j] =0;
                }
            }
        }

        if(firstRow) {
            for(int j =0; j< n;j++) {
                matrix[0][j] =0;
            }
        }
        if(firstCol){
            for(int i = 0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][]={{0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}};

        setZeroes(matrix);

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0 ;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}