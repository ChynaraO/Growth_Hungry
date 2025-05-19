package JavaIntensive.W5_HW.TextFormatter;

public class LowercaseFormatter implements Formatter{
    @Override
    public String format(String input) {
        return input.toLowerCase();
    }
}
