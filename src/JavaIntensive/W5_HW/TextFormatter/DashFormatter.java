package JavaIntensive.W5_HW.TextFormatter;

public class DashFormatter implements Formatter{

    @Override
    public String format(String input) {
        return input.replace(" ", "-");
    }
}
