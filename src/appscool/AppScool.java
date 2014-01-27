/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author khadre
 */
public class AppScool extends Application{

    @Override
    public void start(Stage primaryStage){
        
        
        VBox box=new VBox(10);
        box.setAlignment(Pos.CENTER);
        Scene scene=new Scene(box,500,500,Color.LIGHTBLUE);
        
        TextField login=new TextField("Login");
        login.setMaxWidth(150);
        box.getChildren().add(login);
        
        PasswordField password=new PasswordField();
        password.setMaxWidth(150);
        box.getChildren().add(password);
        
        final Button bCon=new Button("Se connecter");
        bCon.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                bCon.setText("Se connecter cliqué");
            }
        });
        box.getChildren().add(bCon);
        
        Button bReturn=new Button("Retour");
        
        box.getChildren().add(bReturn);
        
        HBox hb=new HBox();
        hb.setAlignment(Pos.BOTTOM_CENTER);
        Text authen=new Text("Authentification - Administrateur");
        hb.getChildren().add(authen);
        box.getChildren().add(hb);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
