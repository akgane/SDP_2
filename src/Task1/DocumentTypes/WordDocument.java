package Task1.DocumentTypes;

import Task1.Interfaces.DocumentInterface;

public class WordDocument implements DocumentInterface {
    @Override
    public void createDoc() {
        System.out.println("Word document created!");
    }
}
