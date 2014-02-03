/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;


import appscool.presenter.AbstractPresenter;
import appscool.view.AbstractView;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 *
 * @author amma
 */



public class AuthentificationAdminView extends Stage implements AbstractView{

    @Override
    public AbstractPresenter getPresenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPresenter(AbstractPresenter presenter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public AuthentificationAdminView(){

        GridPane grid=new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setPadding(new Insets(25,25,25,10));

        Scene scene=new Scene(grid,500,500,Color.STEELBLUE);
        scene.getStylesheets().add(AuthentificationAdminView.class.getResource("AuthentificationAdminView.css").toExternalForm());

        VBox vbox1=new VBox(15);
        grid.add(vbox1,1,0,1,2);

        TextField login=new TextField();
        login.setPromptText("Login");
        login.setMaxWidth(150);
        vbox1.getChildren().add(login);

        PasswordField password=new PasswordField();
        password.setPromptText("Mot De Passe");
        password.setMaxWidth(150);
        vbox1.getChildren().add(password);

        VBox vbox2=new VBox(15);
        vbox2.setTranslateX(25);
        grid.add(vbox2,1,3,1,2);

        final Button btnConnection=new Button("Se connecter");
        /*btnConnection.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
              fermer();
            }
        });*/

        btnConnection.setMaxWidth(100);
        vbox2.getChildren().add(btnConnection);
        Button btnReturn=new Button("Retour");
        btnReturn.setMaxWidth(100);
        vbox2.getChildren().add(btnReturn);


        Text authen=new Text("Authentification - Administrateur");
        authen.setTranslateY(50);
        grid.add(authen,1,9);

        this.setScene(scene);
        this.show();
        }
        public void fermer(){
            this.close();
            AdminView fen=new AdminView();
        }
}
