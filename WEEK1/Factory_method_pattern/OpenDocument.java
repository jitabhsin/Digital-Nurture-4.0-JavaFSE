public class OpenDocument {

    static class WordDocument implements Document {
        public void display() {
            System.out.println("Opened Word Document");
        }
    }

    static class PdfDocument implements Document {
        public void display() {
            System.out.println("Opened PDF Document");
        }
    }

    static class ExcelDocument implements Document {
        public void display() {
            System.out.println("Opened Excel Document");
        }
    }
}
