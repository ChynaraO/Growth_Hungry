package DesignPrinciples.SOLID.I.Bad;

/* Interface Segragation Principle
no code should be forced to depend on methods it does not use

-A "big" interface.
 A Robot is forced to implement eat() and sleep(),
 which it doesn't do.
 */


public interface IWorker {
    void work();
    void eat();
    void sleep();
}
class Human implements IWorker{
    //implements all 3 methods

    @Override
    public void work() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }
}

class Robot implements IWorker{
    public void work() {
    }
    public void eat() {
        /* do nothing*/
    }
    //Forced to implement

    public void sleep() {
        /* do nothing*/
    }
    //Forced to implement
}
