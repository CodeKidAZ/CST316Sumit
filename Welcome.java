package Simulation;
import javafx.event.ActionEvent;
import javafx.scene.*;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Created by Sumit on 12/31/2014.
 */
public class Welcome
{
    AnchorPane root = new AnchorPane();
    Scene scene;

    public Welcome(Stage k)
    {
        Button next = new Button();
        next.setLayoutX(618);
        next.setLayoutY(510);
        next.setPrefWidth(100);
        next.setOpacity(0.27);
        next.setOnAction((ActionEvent e) ->
        {

        });
        root.prefHeight(625);
        root.prefWidth(815);

        scene = new Scene(root, 830, 643); //W*H

        Image image1 = new Image("Simulation/designs/1.png");
        ImageView imageView = new ImageView(image1);
        imageView.setLayoutX(-4);
        imageView.setLayoutY(-3);

       // imageView.setPreserveRatio(true);

        imageView.fitWidthProperty().bind(k.widthProperty());
        imageView.fitHeightProperty().bind(k.heightProperty());
        //imageView.setSmooth(true);


        root.getChildren().addAll(imageView,next);

        k.setScene(scene);
        k.show();


    }
}
