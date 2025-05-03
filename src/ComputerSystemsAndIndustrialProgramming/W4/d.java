package ComputerSystemsAndIndustrialProgramming.W4;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class d {

    public static void main(String[] args) {
        int n = addTwoNumbers(2,3);
        System.out.println(n);

    }
    public static int addTwoNumbers(int a, int b) {
        // Your code here
        return a + b;
    }
    // Overloaded methods for sum
    public int sum(int a, int b) {
        // Your code here
        return a+b;
    }
    public int sum(int... a) {
        // Your code here
        return IntStream.of(a).sum();
    }

    public double sum(double a, double b) {
        // Your code here
        return a+b;
    }
    public double sum(double... a) {
        // Your code here
        return DoubleStream.of(a).sum();
    }
}
