/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

<<<<<<< HEAD
import appscool.AppScool;
import appscool.presenter.AbstractPresenter;
import appscool.presenter.YearXYStudentsAdminPresenter;
import appscool.view.AbstractView;
=======
>>>>>>> cf2052ce206a93451c7aecdb6d4d5084f1ca611d
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
<<<<<<< HEAD
    StackPane root=new StackPane();
        root.setPadding(new Insets(15,5,20,5));
        Scene scene=new Scene(root,500,500);
        scene.getStylesheets().add(AppScool.class.getResource("AdminView.css").toExternalForm());

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

=======
        
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
>>>>>>> cf2052ce206a93451c7aecdb6d4d5084f1ca611d
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
<<<<<<< HEAD
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

=======
        
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
>>>>>>> cf2052ce206a93451c7aecdb6d4d5084f1ca611d
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
