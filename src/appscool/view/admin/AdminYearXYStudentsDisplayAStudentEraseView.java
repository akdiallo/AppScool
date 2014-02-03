/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import appscool.presenter.AbstractPresenter;
import appscool.view.AbstractView;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author amma
 */
public class AdminYearXYStudentsDisplayAStudentEraseView extends Stage implements AbstractView{

    public double width=500,height=500;

    public AdminYearXYStudentsDisplayAStudentEraseView(){

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

        Label position=new Label("Année 20XX-20YY >Les élèves >Afficher un élève >Effacer cet élève");
        anchor.setTopAnchor(position,0.0);
        anchor.setLeftAnchor(position,0.0);

        StackPane stack=new StackPane();
        anchor.setLeftAnchor(stack,width/6);
        anchor.setTopAnchor(stack,height/4);
        anchor.getChildren().addAll(position,stack);

        Rectangle r=new Rectangle();
        r.setWidth(2*width/3);
        r.setHeight(height/4);
        r.setArcHeight(30);
        r.setArcWidth(30);
        r.setFill(Color.LIGHTGREEN);

        GridPane grid=new GridPane();
        grid.setVgap(10);
        grid.setAlignment(Pos.TOP_CENTER);
        Label rUSure=new Label("Êtes vous sûre de vouloir supprimer cet individu?");
        rUSure.setFont(new Font("Arial",14));
        Label caution=new Label("Attention: Ce dernier ne figurera plus sur la base de données");
        caution.setFont(new Font("Arial",11));

        GridPane btnsgrid=new GridPane();
        btnsgrid.setAlignment(Pos.CENTER);
        HBox btnshbox=new HBox(10);
        btnsgrid.add(btnshbox, 0, 0);

        Button conf=new Button("Confirmer");
        Button cancel=new Button("Annuler");
        btnshbox.getChildren().addAll(conf,cancel);

        grid.add(rUSure, 0, 0);
        grid.add(caution,0,1);
        grid.add(btnsgrid,0,2);

        stack.getChildren().addAll(r,grid);

        TilePane tile=new TilePane();
        tile.setPrefColumns(4);
        tile.setPrefRows(1);
        tile.getChildren().addAll(new Label(" "),new Label("Espace - Administrateur -"),
                new Label(" Année 20XX- Année 20YY"),new Label(" ")
        );
        border.setBottom(tile);

        this.setScene(new Scene(border,width,height));
        this.setResizable(false);
        this.show();
    }

    @Override
    public AbstractPresenter getPresenter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPresenter(AbstractPresenter presenter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
