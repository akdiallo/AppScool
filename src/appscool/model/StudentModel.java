/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.model;

/**
 *
 * @author khadre
 */
public class StudentModel {
    private int numEleve;
    private String adresseParents;
    private int numAssurance;

   //getters
    public int getNumEleve(){
        return numEleve;
    }
    public String getAdresseParents(){
        return adresseParents;
    }
    public int getNumAssurance(){
        return numAssurance;
    }

    //setter
    public void setAdresseParents(String  adr){
        this.adresseParents = adr;
    }

}
