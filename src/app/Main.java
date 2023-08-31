package app;

public class Main {
    
    public static void main(String[] args) {
        View view = new View();

        JpgImage jpgImage = new JpgImage();
        PngImage pngImage = new PngImage();

        Image jpgAdapter = new Adapter(jpgImage);
        Image pngAdapter = new Adapter(pngImage);

        view.viewImage(jpgAdapter);
        view.viewImage(pngAdapter);
    }
}