package Task2.Theme.Factories;

import Task2.Interfaces.GUIComponents.Button;
import Task2.Interfaces.GUIComponents.CheckBox;
import Task2.Interfaces.ThemeFactory;
import Task2.Theme.Dark.DarkButton;
import Task2.Theme.Dark.DarkCheckbox;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckbox();
    }
}
