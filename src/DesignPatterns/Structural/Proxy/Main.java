package DesignPatterns.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();
        internet.connect("google.com");
        internet.connect("blocked-site.com");
    }
}
