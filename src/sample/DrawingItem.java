package sample;

abstract class DrawingItem{
    private Color color;
    DrawingItem previousState;

    public Point getAnchor(){
        return null;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color newColor){
        color = newColor;
    }
}
