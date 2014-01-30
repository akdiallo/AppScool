/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.model;

import java.util.List;

/**
 *
 * @author minalouta
 */
public class StudentModel {
    private int numEleve;
    private String adresseParents;
    private int numAssurance;
    private List <SubjectModel> SubjectList;
    private  List <GradeModel> gradesList;

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
    public List getSubjectList(){
        return SubjectList;
    }
    public List getgradesList(){
        return gradesList;
    }

    //setter
    public void setAdresseParents(String  adr){
        this.adresseParents = adr;
    }

    public void setNumEleve(int numEleve) {
        this.numEleve = numEleve;
    }

    public void setNumAssurance(int numAssurance) {
        this.numAssurance = numAssurance;
    }

}
