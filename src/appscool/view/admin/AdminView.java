/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import appscool.AppScool;
import appscool.presenter.AbstractPresenter;
import appscool.presenter.YearXYStudentsAdminPresenter;
import appscool.view.AbstractView;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminView extends Stage implements AbstractView{

    private YearXYStudentsAdminPresenter presenter;

    public AdminView(){

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

        GridPane grid=new GridPane();
        grid.setHgap(20);
        grid.setVgap(30);
        anchor.setLeftAnchor(grid,0.0);
        anchor.setTopAnchor(grid,0.0);
        anchor.setRightAnchor(grid,0.0);
        anchor.getChildren().add(grid);

        HBox hboxEtat=new HBox();
        Label etat=new Label("Etat");
        hboxEtat.setId("HboxEtat");
        hboxEtat.getChildren().add(etat);
        grid.add(hboxEtat,1,0);
        Label actions=new Label("Actions");
        etat.setStyle("-fx-style-background: white;");
        grid.add(actions,2,0,2,1);

        for(int i=0;i<5;i++){
            Button btn=new Button("Année 20XX - 20YY");
            grid.add(btn,0,i+1);
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


        Button btnAddAYear=new Button("Ajouter une année");
        Button btnChangePersInf=new Button("Modifier mes informations personnelles");
        grid.add(btnAddAYear, 0, 7);
        grid.add(btnChangePersInf,1,7,3,1);

        TilePane tile=new TilePane();
        tile.setPrefColumns(2);
        border.setBottom(tile);
        Label admin=new Label("Espace  Administrateur");
        tile.getChildren().addAll(new Label(" "),admin);

        Scene scene=new Scene(border,500,500);
        scene.getStylesheets().add(AdminView.class.getResource("AdminView.css").toExternalForm());
        this.setScene(scene);
        this.show();
    }
    public Button AddButtonYear(){
        Button newBtn=new Button("Anne 20XX-Anne 20YY");
        newBtn.setPrefSize(150,30);
        return newBtn;
    }

    @Override
    public AbstractPresenter getPresenter() {
        return this.presenter;
    }

    @Override
    public void setPresenter(AbstractPresenter presenter) {
        // we do a casting
        this.presenter = (YearXYStudentsAdminPresenter) presenter;
    }
}
