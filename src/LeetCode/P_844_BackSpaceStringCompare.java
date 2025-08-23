package LeetCode;

public class P_844_BackSpaceStringCompare {
    public static boolean backspaceStringCompare(String s, String t) {
        if(build(s).equals(build(t))){
            return true;
        } return false;
    }
    private static String build (String s){

       StringBuilder builder = new StringBuilder();
       for(char c : s.toCharArray()){
           if(c != '#'){
               builder.append(c);
           } else{
               if(builder.length() != 0){
                   builder.deleteCharAt(builder.length()-1);
               }
           }
       }
       return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(backspaceStringCompare("Str#", "G#Str#"));
    }
}
