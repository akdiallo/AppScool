/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminViewYearXYStudentsAddAStudent extends Stage{
    
    public AdminViewYearXYStudentsAddAStudent(){
        BorderPane root=new BorderPane();
        root.setPadding(new Insets(10,5,10,5));
        
        HBox hbox=new HBox();
        root.setTop(hbox);
        AnchorPane hboxAnchor=new AnchorPane();
        hbox.getChildren().add(hboxAnchor);
        HBox.setHgrow(hboxAnchor, Priority.ALWAYS);
        
        Label welcome=new Label("Bienvenue sur votre espace de gestion M. XY");
        HBox hb=new HBox(10);
        hb.getChildren().addAll(new Button("Retour"),
                new Button("Déconnection")
        );
        hboxAnchor.setLeftAnchor(welcome,0.0);
        hboxAnchor.setRightAnchor(hb,0.0);
        hboxAnchor.getChildren().addAll(welcome,hb);
    }
}
