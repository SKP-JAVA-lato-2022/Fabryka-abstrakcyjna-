package factories;

import products.buttons.Button;
import products.buttons.MacOSButton;
import products.checkboxes.Checkbox;
import products.checkboxes.MacOScheckbox;

public class MacOsFacotry implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOScheckbox();
    }
}
