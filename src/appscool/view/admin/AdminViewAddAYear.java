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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminViewAddAYear extends Stage{
    private double width=500;
    private double height=450;
    public AdminViewAddAYear(){
        GridPane root=new GridPane();
        root.setVgap(30);
        root.setPadding(new Insets(10,5,10,5));
        Scene scene=new Scene(root,width,height);
       
        HBox hbox1=new HBox(200);
        hbox1.setPrefWidth(width-10);
        hbox1.getChildren().addAll(new Text("Bienvenue sur votre espace M.XY"),
                new Button("Déconnection")
        ); 
        root.addRow(0,hbox1);
        
        HBox hbox2=new HBox(20);
        hbox2.setPrefWidth(width-10); 
        hbox2.getChildren().addAll(
                new Button("Incrémenter l'année"),
                new Button("Base Vierge"),
                new Button("Mise à jour des infos de l'établissement")
        );
        root.addRow(1,hbox2);
        
        HBox hbox3=new HBox(20);
        hbox3.setPrefWidth(width-10);
        hbox3.getChildren().addAll(
                new Button("Copier les personnes de l'année précédente"),
                new Button("Copier les classes de l'année précédente"),
                new Button("Copier les matières de l'année précédente")
        );
        root.addRow(2,hbox3);
        
        HBox hbox4=new HBox(100);
        hbox4.setPrefWidth(width-10);
        hbox4.setTranslateX(100);
        hbox4.getChildren().addAll(new Button("Valider"),new Button("Annuler"));
        root.addRow(4,hbox4);
        
        HBox hbox5=new HBox();
        hbox5.getChildren().add(new Text("Espace - Administrateur - Année 20XX-20YY"));
        hbox5.setAlignment(Pos.BOTTOM_CENTER);
        root.addRow(6,hbox5);
        
        this.setScene(scene);
    }
}
