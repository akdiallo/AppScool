/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;


import appscool.model.AdministratorModel;
import appscool.presenter.AuthentificationAdminPresenter;
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

        AdministratorModel adminModel = new AdministratorModel();
        AuthentificationAdminPresenter adminPresenter = new AuthentificationAdminPresenter();

        adminPresenter.setModel(adminModel);
        
        AdminViewYearXYStudents adminView = new AdminViewYearXYStudents();
        adminPresenter.setView(adminView);
        primaryStage=adminView;
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
