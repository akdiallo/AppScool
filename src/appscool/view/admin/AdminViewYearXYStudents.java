/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminViewYearXYStudents extends Stage{
    public AdminViewYearXYStudents(){
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
       
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(30,0,30,0));
        grid.setHgap(20);
        grid.setVgap(50);
        root.setCenter(grid);
        
        Button addAStudent=new Button("Ajouter un élève");
        addAStudent.setPrefSize(150, 40);
        grid.add(addAStudent,0,0);
        Button modifyAStudent=new Button("Modifier un élève");
        modifyAStudent.setPrefSize(150, 40);
        grid.add(modifyAStudent,1,0);
        Button marksOfAStudent=new Button("Consulter les notes d'un élève");
        marksOfAStudent.setPrefSize(150, 40);
        grid.setHalignment(marksOfAStudent,HPos.RIGHT);
        grid.add(marksOfAStudent,2,0);
        Button listOfStudents=new Button("Listes des élèves de l'Ètablissement");
        listOfStudents.setPrefSize(150, 40);
        grid.add(listOfStudents,0,1);
        Button stat=new Button("Statistiques");
        stat.setPrefSize(150, 40);
        grid.add(stat,1,1);
        Button displayAStudent=new Button("Afficher un élève");
        displayAStudent.setPrefSize(150, 40);
        grid.add(displayAStudent,2,1);
        Button emptyBtn1=new Button("............");
        emptyBtn1.setPrefSize(150, 40);
        grid.setValignment(emptyBtn1,VPos.BOTTOM);
        grid.add(emptyBtn1,0,2);
        Button emptyBtn2=new Button(".............");
        emptyBtn2.setPrefSize(150, 40);
        grid.add(emptyBtn2,1,2);
        Button emptyBtn3=new Button("..............");
        emptyBtn3.setPrefSize(150, 40);
        grid.add(emptyBtn3,2,2);
        
        Label admin=new Label("Espace - Administrateur - Année 20XX-20YY");
        root.setBottom(admin);
        this.setScene(new Scene(root,500,500));
    }
    
}
