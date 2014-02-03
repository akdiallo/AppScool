/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appscool.model;

/**
 *
 * @author Abibatou
 */
public class ClasseModel {
    private String intitule;
    private String niveau;
    private int effectif;
    
    //Definition des Getteurs
    
    public String getIntitule(){
        return intitule;
    }
    public String getNiveau(){
        return niveau;
    }
    public int getEffectif(){
        return effectif;
    }
    
    //Definition des setteurs
    
    public void setIntitule(String inti){
        this.intitule = inti;
    }
    public void setNiveau(String Niv){
        this.niveau = Niv;
    }
    public void setEffectif (int eff){
        this.effectif = eff;
    }
}
