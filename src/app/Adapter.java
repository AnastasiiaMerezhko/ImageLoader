package app;

public class Adapter implements Image {
    private Image image;
    public Adapter(Image image) {
        this.image = image;
    }
    @Override
    public String getFormat() {
        return image.getFormat();
    }
    @Override
    public String getFileName() {
        return image.getFileName();
    }
}