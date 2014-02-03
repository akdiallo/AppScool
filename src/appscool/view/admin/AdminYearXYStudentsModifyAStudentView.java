/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.view.admin;

import javafx.scene.control.TextField;

/**
 *
 * @author amma
 */
public class AdminYearXYStudentsModifyAStudentView extends AdminViewYearXYStudentsAddAStudent{
    
    public AdminYearXYStudentsModifyAStudentView(){
        this.position.setText("Année 20XX-20YY >Les élèves >Modifier un élève");
        TextField searchingBox=new TextField("Recherche par ID ou nom,prénom");
        searchingBox.setPrefHeight(30);
        this.anchor.setTopAnchor(searchingBox,5.0);
        this.anchor.setRightAnchor(searchingBox,0.0);
        this.anchor.getChildren().add(searchingBox);
    }
    
}
