package LeetCode.Medium;

import java.util.Arrays;

class P_304_RangeSumQuery2DImmutable {
    int[][] sum;
    public P_304_RangeSumQuery2DImmutable(int [][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        //sum[i][j] is the sum of all elements
        //inside the prefix submatrix [1..i[1..j].
        sum = new int[m+1][n+1];
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                //sum of all elements from (1,1) till(i,j)
                sum[i][j] = sum[i-1][j] +
                        sum[i][j-1]
                        -sum[i-1][j-1]+
                        matrix[i-1][j-1];
            }
        }// from left ro right from top to bottom
    }
    public int sumRegion(int r1, int c1, int r2, int c2){
        r1++; c1++; r2++; c2++;
        return sum[r2][c2] - sum[r1-1][c2] - sum[r2][c1-1] + sum[r1-1][c1-1];
    }

     public static void main(String[] args) {
         /**
          * Your NumMatrix object will be instantiated and called as such:
          * NumMatrix obj = new NumMatrix(matrix);
          * int param_1 = obj.sumRegion(row1,col1,row2,col2);
          */
         int [][] matrix = {
                 {3, 0, 1, 4, 2}, //10
                 {5, 6, 3, 2, 1},  //27
                 {1, 2, 0, 1, 5},  //36
                 {4, 1, 0, 1, 7},
                 {1, 0, 3, 0, 5}};
         P_304_RangeSumQuery2DImmutable p = new P_304_RangeSumQuery2DImmutable(matrix);
         for (int[] row : p.sum) {
             System.out.println(Arrays.toString(row));
         }
//         System.out.println(Arrays.deepToString(p.sum));
         System.out.println(p.sumRegion(2, 1, 4, 3));//8
         System.out.println(p.sumRegion(1, 1, 2, 2));//11
     }
}
