package Simulation;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Sumit on 12/31/2014.
 */
public class Main  extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
/*
        Parent root = FXMLLoader.load(getClass().getResource("designs/welcome.fxml"));
        Scene scene = new Scene(root, 830, 643);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();

*/
        //Welcome a = new Welcome(primaryStage);
        HumanResource b = new HumanResource(primaryStage);



    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}

