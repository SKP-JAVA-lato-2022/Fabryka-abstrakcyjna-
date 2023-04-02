package app;

import factories.GUIFactory;
import products.buttons.Button;
import products.checkboxes.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
