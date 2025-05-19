package JavaIntensive.W5_HW.TextFormatter;

public class FormatterFactory {
    public static Formatter getFormatter(String name){
        return switch (name) {
            case "LowercaseFormatter" -> new LowercaseFormatter();
            case "UppercaseFormatter" -> new UppercaseFormatter();
            case "ReverseFormatter" -> new ReverseFormatter();
            case "CamelcaseFormatter" -> new CamelcaseFormattter();
            case "DashFormatter" -> new DashFormatter();
            default -> throw new IllegalArgumentException("Unknown formatter: " + name);
        };
    }
}
