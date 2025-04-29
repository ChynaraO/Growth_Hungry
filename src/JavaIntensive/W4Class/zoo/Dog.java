package JavaIntensive.W4Class.zoo;

public class Dog extends Animal
{

    public Dog(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println(this.name + " barked");
    }
}
