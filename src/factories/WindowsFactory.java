package factories;

import products.buttons.Button;
import products.buttons.WinButton;
import products.checkboxes.Checkbox;
import products.checkboxes.WinCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
