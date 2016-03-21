//U10416036
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.*;

/**
 *
 * @author MengLin
 */
public class BeanGame extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Drawer(), 300, 300);
        primaryStage.setTitle("BeanGame");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
class Drawer extends Pane{
    public Drawer(){
        Line l1 = new Line(130,55,130,85);
        Line l2 = new Line(130,85,60,250);
        Line l3 = new Line(60,250,60,280);
        Line l4 = new Line(60,280,240,280);
        Line l5 = new Line(240,280,240,250);
        Line l6 = new Line(240,250,170,85);
        Line l7 = new Line(170,85,170,55);

        getChildren().add(l1);
        getChildren().add(l2);
        getChildren().add(l3);
        getChildren().add(l4);
        getChildren().add(l5);
        getChildren().add(l6);
        getChildren().add(l7);

        double bottom = ((240 - 60) / 8);
        for(int i = 1; i < 8; i++){
            int locate = (int)(60 + Math.round((bottom) * i));
            Line s = new Line(locate, 250, locate, 280);
            getChildren().add(s);
            
            Circle circle = new Circle();
            circle.setCenterX(locate);
            circle.setCenterY(250);
            circle.setRadius(5.0f);
            getChildren().add(circle);
        }
        Circle c1 = new Circle();
        c1.setCenterX(150);
        c1.setCenterY(95);
        c1.setRadius(5.0f);
        getChildren().add(c1);
        float x = (240 - 60) / (8*2);
        float y = (250 - 90) / 6;
        for(int i = 1;i<6;i++){
            for(int j = 0; j <= i; j++){
                Circle c2 = new Circle();
                c2.setCenterX(150-x*i + 2*x*j);
                c2.setCenterY(95+y*i);
                c2.setRadius(5.0f);
                getChildren().add(c2);
            }
        }
    }
    
    
}
