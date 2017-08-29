package sample;

public class Oval extends DrawingItem {
    private Point anchor;
    private double width;
    private double height;
    private double weight;

    public Oval(Point anchor, double width, double height, double weight){
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Point getAnchor(){
        return anchor;
    }

    public void SetAnchor(Point point){
        anchor = point;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
