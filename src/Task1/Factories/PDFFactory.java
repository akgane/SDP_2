package Task1.Factories;

import Task1.DocumentTypes.PDFDocument;
import Task1.Interfaces.DocumentInterface;

public class PDFFactory extends DocumentFactory{
    @Override
    public DocumentInterface createDocument() {
        return new PDFDocument();
    }
}
