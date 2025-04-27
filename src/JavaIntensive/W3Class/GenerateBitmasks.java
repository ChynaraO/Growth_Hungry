package JavaIntensive.W3Class;

public class GenerateBitmasks {
    public static void main(String[] args) {
generate(2, "");
    }
    public static void generate (int n, String s){
        if(n == 0) {
            System.out.println(s);
            return;
        }
        s += "0";
        generate(n-1, s);
        s = s.substring(0, s.length()-1);
        s += "1";
        generate(n-1, s);
        s = s.substring(0, s.length()-1);
    }
}
