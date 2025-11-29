package DesignPatterns.Creational.AbstractFactory;

public class MacFactory implements GUIFactory {
    /**
     * @return
     */
    @Override
    public Button createButton() {
        return new MacButton();
    }

    /**
     * @return
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
