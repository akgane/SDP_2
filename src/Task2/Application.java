package Task2;

import Task2.Interfaces.GUIComponents.Button;
import Task2.Interfaces.GUIComponents.CheckBox;
import Task2.Interfaces.ThemeFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(ThemeFactory themeFactory){
        button = themeFactory.createButton();
        checkBox = themeFactory.createCheckBox();
    }

    public void displayComponents(){
        button.display();
        checkBox.display();
    }
}
