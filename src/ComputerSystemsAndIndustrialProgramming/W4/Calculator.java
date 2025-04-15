package ComputerSystemsAndIndustrialProgramming.W4;

import java.util.stream.DoubleStream;

public class Calculator {
    static double add (double... operands){
        return DoubleStream.of(operands)
                .sum();
    }
    static double multiply (double... operands){
        return DoubleStream.of(operands)
                .reduce(1,(a,b) -> a * b);
    }
    // Function to find length and iterate over a string
    public void processString(String input) {
        // Your code here
        int num = input.length();
        System.out.println(num);
        for(int i = 0; i<num; i++){
            System.out.println(input.charAt(i));
        }
    }
}
