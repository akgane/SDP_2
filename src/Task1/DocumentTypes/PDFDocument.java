package Task1.DocumentTypes;

import Task1.Interfaces.DocumentInterface;

public class PDFDocument implements DocumentInterface {
    @Override
    public void createDoc() {
        System.out.println("PDF Document created!");
    }
}
