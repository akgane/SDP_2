package Task2.Interfaces;

import Task2.Interfaces.GUIComponents.Button;
import Task2.Interfaces.GUIComponents.CheckBox;

public interface ThemeFactory {
    Button createButton();
    CheckBox createCheckBox();
}
