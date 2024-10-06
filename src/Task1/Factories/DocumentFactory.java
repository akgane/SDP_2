package Task1.Factories;

import Task1.Interfaces.DocumentInterface;

public abstract class DocumentFactory {
    public abstract DocumentInterface createDocument();

    public void generateDoc(){
        DocumentInterface doc = createDocument();
        doc.createDoc();
    }
}
