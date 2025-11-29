package DesignPatterns.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        //suppose System.getProperty("os.name") gives Windows
        String os = "Windows";

        if(os.equalsIgnoreCase("Windows")){
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
        Application app = new Application(factory);
        app.render();
    }
}
