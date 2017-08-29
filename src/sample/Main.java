package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Canvas canvas = new Canvas(1280, 720);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Group root = new Group();
        Scene scene = new Scene(root, 1280, 720);

        Drawing drawing = new Drawing();

        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Point anchor = new Point(event.getSceneX(), event.getSceneY());

                Oval o = new Oval(anchor, 100, 100, 1);
                o.setColor(Color.BLUE);
                drawing.items.add(o);

                Refresh(gc, drawing);
            }
        });
        root.getChildren().add(canvas);
        primaryStage.setTitle("Drawing");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    private void Refresh(GraphicsContext gc, Drawing drawing){

        for (DrawingItem d: drawing.items) {

            if (d instanceof Oval){
                Oval oval = (Oval) d;
                gc.fillOval(oval.anchor.x, oval.anchor.y, oval.width, oval.height);
            }

            if (d instanceof Polygon){
                Polygon polygon = (Polygon) d;
                //gc.fillPolygon();
            }

            if (d instanceof PaintedText){
                PaintedText paintedText = (PaintedText) d;
            }

            if (d instanceof Image){
                Image image = (Image) d;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

