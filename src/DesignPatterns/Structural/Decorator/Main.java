package DesignPatterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza =
                new MashroomDecorator(
                    new OliveDecorator(
                        new CheeseDecorator(
                            new PlainPizza()
                        )
                    )
                );
        System.out.println(pizza.getDescription());
        System.out.println("Total cost: " + pizza.getCost());

    }
}
