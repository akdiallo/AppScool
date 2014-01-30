/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.scene.Scene;

/**
 *
 * @author amma
 */
public class EspaceAdmin1{
    
    /*public EspaceAdmin1(){
    StackPane root=new StackPane();
        root.setPadding(new Insets(15,5,20,5));
        Scene scene=new Scene(root,500,500);
        scene.getStylesheets().add(AppScool.class.getResource("AppScool.css").toExternalForm());
        
        HBox hbox=new HBox(150);
        hbox.setAlignment(Pos.TOP_LEFT);
        final Text welcome=new Text("Bienvenue sur votre Espace de Gestion M.XY");
        Button btnSignout=new Button("Déconnection");
        btnSignout.setId("signout");
        hbox.getChildren().addAll(welcome,btnSignout);
        root.getChildren().add(hbox);
        
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(25,0,50,0));
        grid.setHgap(40);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);
        
        Label etat=new Label("Etat");
        grid.add(etat,1,0);
        Label actions=new Label("\tActions");
        grid.add(actions,2,0,2,1);
        for(int i=0;i<5;i++){
            grid.add(new Button("Anne 20XX-Anne 20YY"),0,i+1);
            if(i<4){
                grid.add(new Text("Validée"), 1, i+1);
                grid.add(new Text("Consulter"),2,i+1);
                grid.add(new Text("Supprimer"),3,i+1);
            }
            else{
                grid.add(new Text("En cours"), 1, i+1);
                grid.add(new Text("Modifier"),2,i+1);
                grid.add(new Text("Valider"),3,i+1);
            }
        }
        root.getChildren().add(grid);
        
        Button btnAddAYear=new Button("Ajouter une année");
        Button btnChangePersInf=new Button("Modifier mes informations personnelles");
        grid.add(btnAddAYear, 0, 8);
        grid.add(btnChangePersInf,1,8,3,1);
        
        HBox hbox2=new HBox();
        hbox2.setAlignment(Pos.BOTTOM_CENTER);
        Text espaceAdmin=new Text("Espace - Administrateur");
        hbox2.getChildren().add(espaceAdmin);
        root.getChildren().add(hbox2);
    }*/
}
