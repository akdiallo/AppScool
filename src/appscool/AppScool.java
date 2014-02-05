/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;



import appscool.model.AbstractModel;
import appscool.model.AdministratorModel;
import appscool.presenter.AbstractPresenter;
import appscool.presenter.AuthentificationAdminPresenter;

import appscool.view.AbstractView;
import appscool.view.admin.AdminYearXYStudentsDisplayAStudentEraseView;
import appscool.view.admin.AuthentificationAdminView;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author khadre
 */
public class AppScool extends Application{

    @Override
    public void start(Stage primaryStage){

AbstractModel model = new AdministratorModel();
        AbstractPresenter presenter = new AuthentificationAdminPresenter();
        presenter.setModel(model);
        AbstractView view = new AuthentificationAdminView();
        presenter.setView(view);
        primaryStage= (Stage)presenter.getView();


    }
    public static void main(String[] args) {
        launch(args);
    }
    //Test Abibatou
}
