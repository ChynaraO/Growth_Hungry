package LeetCode;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.List;

public class P_3248_SnakeInMatrix {
    public static int finalPositionSnake(int n, List<String> commands){
        int number = 0;
        for(String command : commands){
            if(command.equals("UP")){
                number -= n;
            }else if(command.equals("DOWN")){
                number+= n;
            }else if(command.equals("RIGHT")){
                number++;
            }else if(command.equals("LEFT")){
                number--;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(finalPositionSnake(3, Arrays.asList("RIGHT", "LEFT", "DOWN")));
    }
}
