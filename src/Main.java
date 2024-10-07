import Task1.Factories.*;
import Task2.*;
import Task2.Interfaces.*;
import Task2.Theme.Factories.*;

public class Main {
    public static void main(String[] args) {
//        DocumentTest();
        GUITest();
    }

    /**
     * Factory Method Pattern is best pattern for this scenario.
     * It promotes Open/Closed principle, allowing new document types to be added, without changing
     * existing document types.
     * It also abstracts document creation process, so document creation process doesn't depend
     * on specific classes (document types).
     */
    static void DocumentTest(){
        PDFFactory pdf = new PDFFactory();
        pdf.generateDoc();

        WordFactory word = new WordFactory();
        word.generateDoc();
    }

    /**
     * Abstract Factory Pattern is best pattern for this scenario.
     * It also promotes OCP, allowing new themes to be added, without changing existing themes.
     * Abstract Factory Pattern allows us to create groups of related objects (theme-specific
     * buttons, checkboxes etc.) This pattern is best for scenarios when we need "families" of
     * objects
     */
    static void GUITest(){
        ThemeFactory lightTheme = new LightThemeFactory();
        Application lightApp = new Application(lightTheme);
        System.out.println("Light theme: ");
        lightApp.displayComponents();

        System.out.println("\n==============\n");

        ThemeFactory darkTheme = new DarkThemeFactory();
        Application darkApp = new Application(darkTheme);
        System.out.println("Dark theme: ");
        darkApp.displayComponents();

        //New "blue theme" can be easily added and used
//        ThemeFactory blueTheme = new BlueThemeFactory();
//        Application blueApp = new Application(blueTheme);
//        System.out.println("Blue theme");
//        blueApp.displayComponents();
    }
}