package factories;

import products.buttons.Button;
import products.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
