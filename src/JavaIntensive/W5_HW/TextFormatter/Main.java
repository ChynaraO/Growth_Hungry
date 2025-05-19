package JavaIntensive.W5_HW.TextFormatter;

public class Main {
    public static void main(String[] args) {
        Formatter f = FormatterFactory.getFormatter("LowercaseFormatter");
        System.out.println(f.format("This is a test"));

        Formatter[] formatters = {
                FormatterFactory.getFormatter("LowercaseFormatter"),
                FormatterFactory.getFormatter( "ReverseFormatter"),
                FormatterFactory.getFormatter("DashFormatter")
        };
        String result = FormatterChain.applyFormatters("Chynara is beautiful", formatters);
        System.out.println(result);
    }
}
