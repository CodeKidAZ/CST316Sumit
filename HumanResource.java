package Simulation;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by Sumit on 2/3/2015.
 */
public class HumanResource
{
    AnchorPane root = new AnchorPane();
    Scene scene;
    int salary;

    public HumanResource(Stage k)
    {
        Button hireButt = new Button();
        hireButt.setLayoutX(182.0);
        hireButt.setLayoutY(92.0);
        hireButt.setPrefHeight(53);
        hireButt.setPrefWidth(85.0);
        hireButt.setText("Hire");
        hireButt.setMnemonicParsing(false);

        Button fireButt = new Button();
        fireButt.setLayoutX(182.0);
        fireButt.setLayoutY(179.0);
        fireButt.setPrefHeight(53.0);
        fireButt.setPrefWidth(85.0);
        fireButt.setText("Fire");
        fireButt.setMnemonicParsing(false);
        fireButt.setOnAction((ActionEvent e) ->
        {


        });

        Label a = new Label();
        a.setLayoutX(137);
        a.setLayoutY(32);
        a.setText("HUMAN RESOURCE");
        a.setFont(Font.font(20));



       // root.prefHeight(200);
        //root.prefWidth(200);

        scene = new Scene(root, 449, 345); //W*H
        root.getChildren().addAll(hireButt, fireButt,a);

        k.setScene(scene);
        k.show();


    }

}
