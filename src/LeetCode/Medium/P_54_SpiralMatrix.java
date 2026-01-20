package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class P_54_SpiralMatrix {
    public static List<Integer> spiralOrder(int[][]matrix){
        List<Integer> res = new ArrayList<Integer>();
    if(matrix.length ==0 || matrix[0].length==0){
        return res;
    }

    int top = 0;
    int bottom = matrix.length -1;
    int left = 0;
    int right = matrix[0].length-1;

    while(true){
        // iterate over top row from left to right
        for(int i = left; i<=right; i++) res.add(matrix[top][i]);
        if(++top>bottom) break;
        //iterate over right column, top to bottom
        for(int i = top; i<=bottom ; i++) res.add(matrix[i][right]);
        if(left>-- right) break;
        //iterste over bottom row, right to left
        for(int i = right; i>=left; i--)res.add(matrix[bottom][i]);
        if(top> --bottom) break;
        //iterate over left column bottom to top
        for(int  i = bottom; i>=top; i--)res.add(matrix[i][left]);
        if(++left> right) break;
        }
    return res;
    }

    public static void main(String[] args) {
        int [][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //{1,2,3,4}
        //{5,6,7,8}
        //{9,10,11,12}
        //Output: [1,2,3,4,8,12,11,10,9,5,6,7]
        System.out.println(spiralOrder(nums));
    }
}
