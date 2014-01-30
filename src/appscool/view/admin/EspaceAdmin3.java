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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author amma
 */
public class EspaceAdmin3 {
    public EspaceAdmin3(){
        BorderPane root=new BorderPane();
        root.setPadding(new Insets(10,10,10,10));
        
        HBox hbox=new HBox(50);
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
        
        AnchorPane anchor=new AnchorPane();
        root.setCenter(anchor);
        anchor.setPadding(new Insets(50,0,10,0));
        
        VBox vbox1=new VBox(30);
        vbox1.getChildren().addAll(
            new Button("Èlèves"),
            new Button("Professeurs"),
            new Button("Personnels administratifs"),
            new Button("Matières"),
            new Button("Classes"),
            new Button("Administrateurs")
        );
        
        VBox vbox2=new VBox(5);
        vbox2.getChildren().addAll(
            new Text("Identifiant:XXXXXX"),
            new Text("Nom: X"),
            new Text("Prénom: Y"),
            new Text("Date de Naissance: xx/yy/zzzz"),
            new Text("Lieu de Naissance: 99999"),
            new Text("Sexe: M"),
            new Text("Numéro carte id: xxxxxxxxxxxxx"),
            new Text("Numéri National: xxxxxxxxxx"),
            new Text("Adresse: fffffff"),
            new Text("Email; xxxxx@xxxx.com"),
            new Text("Tel fix:aaaaaaa"),
            new Text("Tel port: vvvvv"),
            new Text("Poste: ddddddd"),
            new Text("Dernière date de connextion: xx/yy/zzzz")
            );
        anchor.setRightAnchor(vbox2,0.0);
        anchor.setTopAnchor(vbox2,0.0);
        anchor.setBottomAnchor(vbox2,0.0);
        anchor.setLeftAnchor(vbox1,0.0);
        anchor.setTopAnchor(vbox1,0.0);
        anchor.setBottomAnchor(vbox1,0.0);
        anchor.getChildren().addAll(vbox1,vbox2);
        
        Label admin=new Label("Espace Administrateur Année 20XX - 20YY");
        root.setBottom(admin);
    }
    
}
