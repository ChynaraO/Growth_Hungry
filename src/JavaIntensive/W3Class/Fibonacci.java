package JavaIntensive.W3Class;

public class Fibonacci {
    //F(n) = F(n-1) + F(n-2);
    //F(1) = 1, F(2) = 1
    //1 1 2 3 5 8 13 21 ...
    //sequence of fibonnacci term, 6 term is 8, given the number of term
    public static int f(int n){
        if (n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return f(n-1) + f(n-2); // f(5) + f(4)
        // f(4) + f(3) + f(3) + f(2)
        // f(3) + f(2) + f(2) + f(1) + f(2) + f(1) + f(2)
        // f(2) + f(1 )

    }

    public static void main(String[] args) {
        System.out.println( f(6));
    }
}
