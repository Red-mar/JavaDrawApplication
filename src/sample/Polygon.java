package sample;

public class Polygon extends DrawingItem{
    private Point[] vertices;
    private double weight;

    public Point[] getVertices() {
        return vertices;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    double getHeight() {
        return 0;
    }

    @Override
    double getWidth() {
        return 0;
    }

    @Override
    Point getAnchor() {
        return null;
    }
}
