package sample;

public class Polygon extends DrawingItem{
    Point[] vertices;
    double weight;

    public Point[] getVertices() {
        return vertices;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
