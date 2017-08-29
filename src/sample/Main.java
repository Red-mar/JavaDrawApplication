package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Canvas canvas = new Canvas(640, 480);

        //GraphicsContext gc = canvas.getGraphicsContext2D();
        //Group root = new Group();
        Scene scene = new Scene(root, 640, 480);
        /*
        list = new ListView<DrawingItem>();
        list.setPrefHeight(600);
        list.setPrefWidth(100);

        deleteBtn = new Button("Delete");

        Drawing drawing = new Drawing();

        deleteBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                DrawingItem diToRemove = null;
                for (DrawingItem d : drawing.items
                     ) {
                    if (list.getSelectionModel().getSelectedItem() == d){
                        diToRemove = d;
                    }
                }

                if (diToRemove != null){
                    drawing.items.remove(diToRemove);
                }


                Refresh(gc,drawing);
            }
        });

        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                point1 = new Point(event.getSceneX(), event.getSceneY());
            }
        });

        canvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                point2 = new Point(event.getSceneX(), event.getSceneY());

                if (event.isAltDown()){
                    Oval o = new Oval(point1, point2.getX() - point1.getX(), point2.getY() - point1.getY(), 1);
                    drawing.items.add(o);
                }
                if (event.isControlDown()){
                    System.out.println("polygon");
                }

                Refresh(gc, drawing);
            }
        });

        */ //root.getChildren().add(canvas);
        //root.getChildren().add(list);
        //root.getChildren().add(deleteBtn);


        primaryStage.setTitle("Drawing");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
/*
    private void Refresh(GraphicsContext gc, Drawing drawing){
        gc.clearRect(0,0,640, 480);

        ObservableList<DrawingItem> items = FXCollections.observableArrayList(drawing.items);
        list.setItems(items);

        for (DrawingItem d: drawing.items) {

            if (d instanceof Oval){
                Oval oval = (Oval) d;
                gc.fillOval(oval.getAnchor().getX(), oval.getAnchor().getY(), oval.getWidth(), oval.getHeight());
            }

            if (d instanceof Polygon){
                Polygon polygon = (Polygon) d;
                double[] point1 = new double[2];
                double[] point2 = new double[2];
                point1[0] = ((Polygon) d).getVertices()[0].getX();
                point1[1] = ((Polygon) d).getVertices()[0].getY();
                point2[0] = ((Polygon) d).getVertices()[1].getX();
                point2[1] = ((Polygon) d).getVertices()[1].getY();

                gc.fillPolygon(point1, point2,1);
            }

            if (d instanceof PaintedText){
                PaintedText paintedText = (PaintedText) d;
                gc.fillText(((PaintedText) d).getContent(),d.getAnchor().x, ((PaintedText) d).getAnchor().y);
            }

            if (d instanceof Image){
                Image image = (Image) d;
                //gc.drawImage();
            }
        }
    }
*/
    public static void main(String[] args) {
        launch(args);
    }
}

