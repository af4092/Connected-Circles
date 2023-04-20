package com.special.effect.javafxprojects.ConnectedCircles;

import com.special.effect.javafxprojects.ModelingGraphs.AbstractGraph;
import com.special.effect.javafxprojects.ModelingGraphs.Graph;
import com.special.effect.javafxprojects.ModelingGraphs.UnweightedGraph;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ConnectedCircles extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new CirclePane(), 450, 350);
        stage.setTitle("Connected Circles");
        stage.setScene(scene);
        stage.show();
    }

    class CirclePane extends Pane {
        public CirclePane(){
            this.setOnMouseClicked(e->{
                if(!isInsideACircle(new Point2D(e.getX(), e.getY()))){
                    getChildren().add(new Circle(e.getX(), e.getY(), 20));
                    colorIfConnected();
                }
            });
        }

        private boolean isInsideACircle(Point2D p){
            for(Node circle: this.getChildren())
                if(circle.contains(p))
                    return true;

            return false;
        }

        private void colorIfConnected(){
            if(getChildren().size() == 0)
                return;

            List<AbstractGraph.Edge> edges = new ArrayList<>();
            for(int i=0; i<getChildren().size(); i++)
                for(int j=i+1; j<getChildren().size(); j++)
                    if(overlaps((Circle)(getChildren().get(i)), (Circle)(getChildren().get(j)))){
                        edges.add(new AbstractGraph.Edge(i, j));
                        edges.add(new AbstractGraph.Edge(j, i));
                    }
            Graph<Node> graph = new UnweightedGraph<>(getChildren(), edges);
            AbstractGraph<Node>.Tree tree = graph.dfs(0);
            boolean isAllCirclesConnected = getChildren().size() == tree
                    .getNumberOfVerticesFound();

            for(Node circle: getChildren()){
                if(isAllCirclesConnected){
                    ((Circle)circle).setFill(Color.RED);
                }else{
                    ((Circle)circle).setStroke(Color.BLACK);
                    ((Circle)circle).setFill(Color.WHITE);
                }
            }
        }

    }
    public static boolean overlaps(Circle circle1, Circle circle2){
        return new Point2D(circle1.getCenterX(), circle1.getCenterY())
                .distance(circle2.getCenterX(), circle2.getCenterY())
                <= circle1.getRadius() + circle2.getRadius();
    }
}
