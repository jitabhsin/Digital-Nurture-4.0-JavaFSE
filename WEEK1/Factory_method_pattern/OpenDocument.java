public class OpenDocument {

    static class Word implements Document {
        public void display() {
            System.out.println("Opened Word Document");
        }
    }

    static class Pdf implements Document {
        public void display() {
            System.out.println("Opened PDF Document");
        }
    }

    static class Excel implements Document {
        public void display() {
            System.out.println("Opened Excel Document");
        }
    }
}
