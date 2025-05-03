package JavaIntensive.W3Class;

public class GenerateBitmasks {
    public static void main(String[] args) {
    generate(1, "");
    }

    public static void generate (int n, String s){
        if(n == 0) {
            System.out.println(s);
            return;
        }
        s += "0";    // a="0"
        generate(n-1, s);
        // 1 , "0"
        // 0 , "00"
        //  01


        s = s.substring(0, s.length()-1);


       //  a = "0";
        s += "1";
        // a = "01"
        generate(n-1, s);
        // 1 , "01"

        s = s.substring(0, s.length()-1);
    }
}
