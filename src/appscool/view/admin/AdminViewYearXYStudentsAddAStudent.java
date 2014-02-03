/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminViewYearXYStudentsAddAStudent extends Stage{
    protected Label position;
    protected AnchorPane anchor;
    
    public AdminViewYearXYStudentsAddAStudent(){
        BorderPane root=new BorderPane();
        root.setPadding(new Insets(10,5,5,5));
        
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
        
        anchor=new AnchorPane();
        root.setCenter(anchor);
        anchor.setPadding(new Insets(25,0,10,0));
        
        position=new Label("Année 20XX-20YY >Les élèves > Ajouter un élève");
        anchor.setTopAnchor(position,0.0);
        anchor.setLeftAnchor(position,0.0);
        
        Label id=new Label("Identifiant:XXXXXX");
        anchor.setLeftAnchor(id,0.0);
        anchor.setTopAnchor(id,10.0);
        
        VBox vbleft=new VBox(11);
        anchor.setLeftAnchor(vbleft,15.0);
        anchor.setTopAnchor(vbleft,50.0);
        VBox vbright=new VBox(5);
        anchor.setRightAnchor(vbright,0.0);
        anchor.setTopAnchor(vbright,50.0);
        
        vbleft.getChildren().addAll(
            new Text("Nom:"),
            new Text("Prénom:"),
            new Text("Date de Naissance:"),
            new Text("Lieu de Naissance:"),
            new Text("Sexe:"),
            new Text("Numéro carte id:"),
            new Text("Numéri Assurance:"),
            new Text("Adresse:"),
            new Text("Adresse Parents:"),
            new Text("Email;"),
            new Text("Tel fixe:"),
            new Text("Tel port:"),
            new Text("Classe:"),
            new Text("Famille:"),
            new Text("Photo:")
        );
        
        HBox classe=new HBox(5);
        classe.getChildren().addAll(new TextField(),new Button("Chercher"));
        HBox family=new HBox(5);
        family.getChildren().addAll(new TextField(),new Button("Chercher"));
        Button upload=new Button("Charger");
        HBox photo=new HBox(5);
        photo.getChildren().addAll(new TextField(),upload);
        ListView<String> sex=new ListView<String>();
        ObservableList<String> items =FXCollections.observableArrayList (
        "M","F");
        sex.setItems(items);
        sex.setPrefHeight(20);
        
        vbright.getChildren().addAll(
            new TextField(),
            new TextField(),
            new TextField("jj/mm/aaaa"),
            new TextField(),
            sex,
            new TextField(),
            new TextField(),
            new TextField(),
            new TextField(),
            new TextField("exemple@exemple.ex"),
            new TextField("+221..."),
            new TextField("+221..."),
            classe,
            family,
            photo    
        );
        
        TilePane tilebtn=new TilePane();
        tilebtn.setPrefColumns(5);
        tilebtn.setPrefRows(1);
        tilebtn.setHgap(15);
        anchor.setBottomAnchor(tilebtn,0.0);
        Button valid=new Button("Valider");
        valid.setPrefSize(100, 30);
        Button erase=new Button("Effacer");
        erase.setPrefSize(100, 30);
        Button display=new Button("Afficher");
        display.setPrefSize(100, 30);
        tilebtn.getChildren().addAll(new Label(" "),valid,erase,display,new Label(" "));        
        
        anchor.getChildren().addAll(id,vbleft,vbright,tilebtn);
        
        TilePane tile=new TilePane();
        tile.setPrefColumns(4);
        tile.setPrefRows(1);
        tile.getChildren().addAll(new Label(" "),new Label("Espace - Administrateur -"),
                new Text(" Année 20XX- Année 20YY"),new Label(" ")
        );
        root.setBottom(tile);
        
        Scene scene=new Scene(root,500,600);
        scene.getStylesheets().add(
                AdminViewYearXYStudentsAddAStudent.class.getResource(
               "AdminViewYearXYStudentsAddAStudent.css").toExternalForm());
        this.setScene(scene);
        this.show();
    }
}
