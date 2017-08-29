package sample;

import java.io.File;

public class Image extends DrawingItem{

    private File file;
    private Point anchor;
    private double width;
    private double height;

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    @Override
    public Point getAnchor() {
        return anchor;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


}
