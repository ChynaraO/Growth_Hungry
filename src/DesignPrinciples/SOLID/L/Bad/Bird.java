package DesignPrinciples.SOLID.L.Bad;

public class Bird {
    /*
    Liskov Substitution Principle Subtypes must be substitutable for their
base types without breaking the program.

BadExample: a Penguin is a Bird, but it can't fly().
Using a Penguin object where a Bird is expected would be an error.
     */
    void fly(){}
}

class Sparrow extends Bird{}//works fine

class Penguin extends Bird{
    void fly() {
        throw new Error("Penguins can't fly!"); //Violates LSP
    }
}
