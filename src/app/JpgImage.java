package app;

public class JpgImage implements Image {

    @Override
    public String getFormat() {
        return "jpg";
    }

    @Override
    public String getFileName() {
        return "melon.jpg";
    }
}