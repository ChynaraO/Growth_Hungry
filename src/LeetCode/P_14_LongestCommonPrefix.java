package LeetCode;

public class P_14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings){
        if(strings == null || strings.length ==0) return "";

        // Start by assuming the first string is the prefix
        String prefix = strings[0];
        for(int i = 1; i < strings.length; i++){
            // While the current string doesn't start with the prefix, trim it
            while(! strings[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }return prefix;
    }



    public static void main(String[] args) {
        String [] s = {"Flower", "Flow", "Flash"};
        System.out.println(longestCommonPrefix(s));
    }
}
