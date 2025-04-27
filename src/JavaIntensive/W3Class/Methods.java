package JavaIntensive.W3Class;

public class Methods {
    public static double sum (double a, double b){
        return a + b;
    }
    public static int sum (int a, int b){
        return a + b;
    }
    public static String string ( char a){
        return String.valueOf(a);
    }
    public static int integers (Object a){
        return (int) a;
    }
    public static void main(String[] args){
        System.out.println(sum(1.5, 2.6));
        System.out.println(sum(2, 0));
        System.out.println(-5);
    }

}
