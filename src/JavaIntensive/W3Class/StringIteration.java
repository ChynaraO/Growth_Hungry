package JavaIntensive.W3Class;

public class StringIteration {
    public static void main(String[] args) {
        String s = "string";
        s+= " string";
        System.out.println(s);
        char[] c = new char[]{'s', 't', 'r', 'i', 'n', 'g'};
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
        for(int i = 0; i<s.length(); ++i){
            System.out.println(s.charAt(i));
        }
        int x = 3;
        Integer y = 4;
        double xx = 3.14;
        boolean True = true;
        s += x;
        s += y;
        s+= xx;
        s+= True;
        System.out.println(s);

    }
}
