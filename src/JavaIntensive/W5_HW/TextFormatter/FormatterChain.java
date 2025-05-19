package JavaIntensive.W5_HW.TextFormatter;

public class FormatterChain {
    public static String applyFormatters(String input, Formatter[] formatters){
        for (Formatter f : formatters){
            input = f.format(input);
        }
        return input;
    }
}
