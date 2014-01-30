/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import appscool.presenter.AbstractPresenter;
import appscool.view.AbstractView;
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
   /*
    GridPane grid;
    public AuthentificationAdminView(){

        this=new super(grid,500,500,Color.LIGHTBLUE);
        grid=new GridPane();
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
        btnConnection.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                btnConnection.setText("Se connecter cliqué");
            }
        });
        btnConnection.setMaxWidth(100);
        vbox2.getChildren().add(btnConnection);

        Button btnReturn=new Button("Retour");
        btnReturn.setMaxWidth(100);
        vbox2.getChildren().add(btnReturn);


        Text authen=new Text("Authentification - Administrateur");
        authen.setTranslateY(50);
        grid.add(authen,1,9);
    }*/
}
