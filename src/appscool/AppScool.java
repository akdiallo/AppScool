/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author khadre
 */
public class AppScool extends Application{

    private double width=500;
    private double height=450;
    @Override
    public void start(Stage primaryStage){
        
        
        
       // primaryStage.setScene(new Scene(root,500,500));
        primaryStage.show();        


    }
    public static void main(String[] args) {
        launch(args);
    }
}
