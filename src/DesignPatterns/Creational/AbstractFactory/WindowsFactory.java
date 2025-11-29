package DesignPatterns.Creational.AbstractFactory;

public class WindowsFactory implements GUIFactory{
    /**
     * @return
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * @return
     */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
