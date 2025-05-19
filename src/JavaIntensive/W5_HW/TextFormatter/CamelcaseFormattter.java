package JavaIntensive.W5_HW.TextFormatter;

public class CamelcaseFormattter implements Formatter{
    @Override
    public String format(String input) {
        String[] string = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder(input);
        for (String s : string){
            stringBuilder.append(Character.toUpperCase(s.charAt(0))).append(s.substring(input.charAt(1)));
        }
        return stringBuilder.toString();
    }
}
