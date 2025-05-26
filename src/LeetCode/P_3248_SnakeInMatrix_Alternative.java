package LeetCode;

import java.util.Arrays;
import java.util.List;

public class P_3248_SnakeInMatrix_Alternative {
    public static int finalPositionSnake(int n, List<String> commands){
        int row = 0;
        int column = 0;
        for(String s : commands){
            switch (s){
                case "UP":
                   row--;
                   break;
                case "DOWN":
                    row++;
                    break;
                case "RIGHT":
                    column++;
                    break;
                case "LEFT":
                    column--;
                    break;
            }

        }
        return row * n + column;
    }

    public static void main(String[] args) {
        System.out.println(finalPositionSnake(3, Arrays.asList("RIGHT", "LEFT", "DOWN")));
    }
}
