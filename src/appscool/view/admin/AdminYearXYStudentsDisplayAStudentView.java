/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class AdminYearXYStudentsDisplayAStudentView extends Stage{
    
    double height=500,width=600;
    public AdminYearXYStudentsDisplayAStudentView(){
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
        
        AnchorPane anchor=new AnchorPane();
        root.setCenter(anchor);
        anchor.setPadding(new Insets(20,0,10,0));
        
        Label position=new Label("Année 20XX-20YY >Les élèves > Afficher un élève");
        anchor.setTopAnchor(position,0.0);
        anchor.setLeftAnchor(position,0.0);
        anchor.getChildren().add(position);
        
        TextField searchingBox=new TextField("Recherche par ID ou nom,prénom");
        searchingBox.setPrefHeight(30);
        System.out.println("La taille de position "+position.getMaxWidth()+" et "+position.getMaxHeight());
        anchor.setTopAnchor(searchingBox,position.getHeight()+10);
        anchor.setLeftAnchor(searchingBox,position.getWidth());
        anchor.getChildren().add(searchingBox);
        
        /*AnchorPane centerAnchor=new AnchorPane();
        System.out.println("La taille du box est de "+searchingBox.getHeight());
        anchor.setTopAnchor(centerAnchor,searchingBox.getHeight()+20);
        anchor.setLeftAnchor(centerAnchor,width/20);
        anchor.setRightAnchor(centerAnchor,width/20);
        anchor.setBottomAnchor(centerAnchor,0.0);
        
        Label year=new Label("Année Scolaire 20XX-20YY");
        centerAnchor.setTopAnchor(year,10.0);
        centerAnchor.setLeftAnchor(year,0.0);
        
        Label schoolName=new Label("Nom de l'établissement");
        centerAnchor.setLeftAnchor(schoolName,year.getWidth()+5.0);
        centerAnchor.setTopAnchor(year,year.getHeight()+5.0);
        
        VBox data=new VBox(5);
        centerAnchor.setLeftAnchor(data,10.0);
        centerAnchor.setTopAnchor(data,40.0);
        data.getChildren().addAll(
            new Text("Identifiant:XXXXXX"),
            new Text("Nom: X"),
            new Text("Prénom: Y"),
            new Text("Date de Naissance: xx/yy/zzzz"),
            new Text("Lieu de Naissance: 99999"),
            new Text("Sexe: M"),
            new Text("Numéro carte id: xxxxxxxxxxxxx"),
            new Text("Numéro Assurance: xxxxxxxxxx"),
            new Text("Adresse: fffffff"),
            new Text("Email; xxxxx@xxxx.com"),
            new Text("Classe: ddddddd"),
            new Text("Tel fix:aaaaaaa"),
            new Text("Tel port: vvvvv")
            
        );
        ImageView photo=new ImageView(new Image(AdminYearXYStudentsDisplayAStudentView.class.getResourceAsStream("images/Am.JPG")));;
        photo.setFitHeight(80);
        photo.setPreserveRatio(true);
        photo.setTranslateY(70);
        photo.setTranslateX(20);
        centerAnchor.setTopAnchor(photo,50.0);
        centerAnchor.setRightAnchor(photo,0.0);
        centerAnchor.getChildren().addAll(year,schoolName,data,photo);
        
        TilePane tilebtn=new TilePane();
        tilebtn.setHgap(10);
        tilebtn.setPrefColumns(4);
        Button modify=new Button("Modifier les\ninformations");
        Button erase=new Button("Supprimer cet\nélève");
        Button print=new Button("Imprimer Carte\nScolaire");
        Button marks=new Button("Voir les Notes\nde cet élève");
        anchor.setBottomAnchor(tilebtn,0.0);
        tilebtn.getChildren().addAll(modify,erase,print,marks);
        
        anchor.getChildren().addAll(centerAnchor,tilebtn);*/
        
        /*TilePane tile=new TilePane();
        tile.setPrefColumns(4);
        tile.setPrefRows(1);
        tile.getChildren().addAll(new Label(" "),new Label("Espace - Administrateur -"),
                new Text(" Année 20XX- Année 20YY"),new Label(" ")
        );
        root.setBottom(tile);*/
        
        Label admin=new Label("Espace Administrateur Année 20XX 20YY");
        admin.setAlignment(Pos.BOTTOM_CENTER);
        root.setBottom(admin);
        Scene scene=new Scene(root,width,height);
        /*scene.getStylesheets().add(
                AdminViewYearXYStudentsAddAStudent.class.getResource(
               "AdminViewYearXYStudentsAddAStudent.css").toExternalForm());*/
        this.setScene(scene);
        this.show();
    }
}
