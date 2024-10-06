package Task1.Factories;

import Task1.DocumentTypes.WordDocument;
import Task1.Interfaces.DocumentInterface;

public class WordFactory extends DocumentFactory{
    @Override
    public DocumentInterface createDocument() {
        return new WordDocument();
    }
}
