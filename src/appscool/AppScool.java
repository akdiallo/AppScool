/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;

import appscool.view.admin.EspaceAdmin4;
import javafx.application.Application;
import javafx.scene.Scene;
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
        primaryStage=new EspaceAdmin4();
        //primaryStage.setScene(new Scene(root,500,500));
        primaryStage.show();        


    }
    public static void main(String[] args) {
        launch(args);
    }
}
