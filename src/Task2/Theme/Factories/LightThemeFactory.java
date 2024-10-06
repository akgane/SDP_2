package Task2.Theme.Factories;

import Task2.Interfaces.GUIComponents.Button;
import Task2.Interfaces.GUIComponents.CheckBox;
import Task2.Interfaces.ThemeFactory;
import Task2.Theme.Light.LightButton;
import Task2.Theme.Light.LightCheckbox;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckbox();
    }
}
