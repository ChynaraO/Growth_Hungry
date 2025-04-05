package Java.week1;

public class Java_W2_String {
    //palindrome same if we reverse like level
    public static int fibonacchi(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        return fibonacchi(n-1) + fibonacchi(n-2);
    }
//1 1 2 3 5 8 11
    public static void main(String[] args) {
        System.out.println(fibonacchi(3));
    }
}
