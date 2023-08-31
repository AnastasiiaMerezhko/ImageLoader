package app;

public class View {
    public void viewImage(Image image) {
        System.out.println("Format: " + image.getFormat());
        System.out.println("File Name: " + image.getFileName());
    }
}