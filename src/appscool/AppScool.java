/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;


import appscool.view.admin.AdminYearXYStudentsDisplayAStudentEraseView;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author khadre
 */
public class AppScool extends Application{

    @Override
    public void start(Stage primaryStage){

        primaryStage=new AdminYearXYStudentsDisplayAStudentEraseView();

    }
    public static void main(String[] args) {
        launch(args);
    }
    //Test Abibatou
}
