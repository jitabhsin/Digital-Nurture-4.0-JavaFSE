public abstract class DocumentFactory {
    abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    Document createDocument() {
        return new OpenDocument.Word();
    }
}

class PdfFactory extends DocumentFactory {
    Document createDocument() {
        return new OpenDocument.Pdf();
    }
}

class ExcelFactory extends DocumentFactory {
    Document createDocument() {
        return new OpenDocument.Excel();
    }
}
