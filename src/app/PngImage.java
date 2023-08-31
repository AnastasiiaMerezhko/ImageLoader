package app;

public class PngImage implements Image{

    @Override
    public String getFormat() {
        return "png";
    }

    @Override
    public String getFileName() {
        return "apple.png";
    }
}