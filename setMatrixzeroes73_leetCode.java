/*
 * Problem => If you find 0 at cell then make all the cells 0 of same row and same col
 * Naive Solution => Naive approach is to traverse each cell and set -1 to all the corresponding row and col cells except if you 0
 * Optimized solution => Take 2 Arrays for Row handler and Col handler where you set true when you see item to be 0; i.e if you see
 *  a[i][j] is 0 then you set row[i] = 1 && col[j] = 1; now traverse each item again this time if row[i] || col[j] is zero then you make the cell 0 continue otherwise
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowHelper= new int[row];
        int[] colHelper = new int[col];
        
        for(int i=0;i<row;++i) {
            for(int j=0; j<matrix[i].length;++j) {
                if(matrix[i][j] ==0 ) {
                    rowHelper[i]=1;
                    colHelper[j]=1;
                }
            }
        }
        
        for(int i=0;i<row;++i) {
            for(int j=0; j<matrix[i].length;++j) {
                if( rowHelper[i]==1 || colHelper[j]==1) {
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }
}