package DesignPatterns.Structural.Proxy;

public class RealInternet implements Internet{
    /**
     * @param website
     */
    @Override
    public void connect(String website) {
        System.out.println("Connecting to " + website);
    }
}
