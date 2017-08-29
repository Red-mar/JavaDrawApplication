package sample;

abstract class DrawingItem{
    private Color color;
    DrawingItem previousState;

    public Color getColor(){
        return color;
    }

    public void setColor(Color newColor){
        color = newColor;
    }

    abstract Point getAnchor();

    abstract double getWidth();

    abstract double getHeight();

    @Override
    public String toString() {
        return "Drawing";
    }
}
