/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminViewAddAYear extends Stage{
    private double width=500;
    private double height=500;
    public AdminViewAddAYear(){
        
        
        BorderPane border=new BorderPane();
        border.setPadding(new Insets(10,5,20,5));
        
        HBox hbox=new HBox();
        border.setTop(hbox);
        AnchorPane hboxAnchor=new AnchorPane();
        hbox.getChildren().add(hboxAnchor);
        hbox.setHgrow(hboxAnchor, Priority.ALWAYS);
        
        Label welcome=new Label("Bienvenue sur votre espace de gestion M. XY");
        Button signout=new Button("Déconnection");
        hboxAnchor.setLeftAnchor(welcome,0.0);
        hboxAnchor.setRightAnchor(signout,0.0);
        hboxAnchor.getChildren().addAll(welcome,signout);
       
        AnchorPane anchor=new AnchorPane();
        border.setCenter(anchor);
        anchor.setPadding(new Insets(25,0,10,0));
        
        Label position=new Label("Ajouter une année");
        anchor.setTopAnchor(position,0.0);
        anchor.setLeftAnchor(position,0.0);
        
        GridPane grid=new GridPane();
        grid.setHgap(20);
        grid.setVgap(50);
        anchor.setLeftAnchor(grid,0.0);
        anchor.setTopAnchor(grid,40.0);
        anchor.setRightAnchor(grid,0.0);
        
        
        Button btn11=new Button("Incrémenter l'année");
        btn11.setPrefSize(150, 40);
        grid.add(btn11,0,0);
        
        Button btn21 = new Button("Base Vierge");
        btn21.setPrefSize(150, 40);
        grid.add(btn21,1,0);
        
        Button btn31= new Button("Mise à jour des infos\n de l'établissement");
        btn31.setPrefSize(150, 40);
        grid.add(btn31,2,0);
        
        Button btn12=new Button("Copier les personnes de\n l'année précédente");
        btn12.setPrefSize(150, 40);
        grid.add(btn12,0,1);
        
        Button btn22=new Button("Copier les classes de \nl'année précédente");
        btn22.setPrefSize(150, 40);
        grid.add(btn22,1,1);
        
        Button btn32=new Button("Copier les matières de\n l'année précédente");
        btn32.setPrefSize(150, 40);
        grid.add(btn32,2,1);
                                   
        
        Button valid=new Button("Valider");
        valid.setPrefSize(150, 30);
        Button cancel=new Button("Annuler");
        cancel.setPrefSize(150, 30);
        grid.add(valid, 0, 2);
        grid.add(cancel,2,2);
        
        anchor.getChildren().addAll(position,grid);
        
       TilePane tile=new TilePane();
        tile.setPrefColumns(4);
        tile.setPrefRows(1);
        tile.getChildren().addAll(new Label(" "),new Label("Espace - Administrateur -"),
                new Label(" Année 20XX- Année 20YY"),new Label(" ")
        );
        border.setBottom(tile);
        Scene scene=new Scene(border,width,height);
        this.setScene(scene);
        this.show();
    }
}
