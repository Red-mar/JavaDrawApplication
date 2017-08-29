package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    Point point1;
    Point point2;



    //@FXML private Button button;
    @FXML private Canvas img;

    private GraphicsContext gc;

    Drawing drawing = new Drawing();

    @FXML private void onMousePressed(MouseEvent event){
        point1 = new Point(event.getSceneX(), event.getSceneY());

        System.out.println("Pressed" + point1.getX() + " : " + point1.getY());
    }

    @FXML private void onMouseReleased(MouseEvent event){
        point2 = new Point(event.getSceneX(), event.getSceneY());

        Oval o = new Oval(point1, point2.getX() - point1.getX(), point2.getY() - point1.getY(), 1);
        drawing.items.add(o);
        Refresh();
    }



    @Override
    public void initialize(URL location, ResourceBundle resources){
        gc = img.getGraphicsContext2D();
    }

    private void Refresh(){
        gc.clearRect(0,0, 400,400);

        for (DrawingItem dI : drawing.items
             ) {
            if (dI instanceof Oval){
                Oval oval = (Oval) dI;
                gc.fillOval(oval.getAnchor().getX(), oval.getAnchor().getY(), oval.getWidth(), oval.getHeight());


                System.out.println(oval.getAnchor().getX() + " : " + oval.getAnchor().getY());
            }

        }
    }
}
