package JavaIntensive.W4Class;

import JavaIntensive.W4Class.zoo.Animal;
import JavaIntensive.W4Class.zoo.Cat;
import JavaIntensive.W4Class.zoo.Dog;
import JavaIntensive.W4Class.zoo.Dog1;

public class Main {
    public static void main(String[] args) {

        Dog1 dog = new Dog1("Sharik"); //we created an instance
//        dog.name = "Bobby";

        dog.bark();

        Dog1 buddy = new Dog1("Rex");
        buddy.name = "Buddy";
        buddy.bark();
        System.out.println(Dog1.count);

        Dog bobby = new Dog("Bo");
        bobby.makeSound();

        Animal animal = bobby;
        animal.makeSound();

        Cat cat = new Cat("Dong");
        makeItSound(cat);
    }
    public static void makeItSound(Animal animal){
        animal.makeSound();
    }
}
