/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;


import appscool.view.admin.AdminViewYearXYStudents;
import javafx.application.Application;
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
        primaryStage=new AdminViewYearXYStudents();
        primaryStage.show();        


    }
    public static void main(String[] args) {
        launch(args);
    }
}
