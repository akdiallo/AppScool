/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.model;

/**
 *
 * @author minalouta
 */
public class SubjectModel {
     private String intitule;
     private int coefficient;

     //getter=accesseur
     public int getCoef(){
         return coefficient;
     }

     //setter=modificateur
     public void setCoef(int val){
         this.coefficient=val;
     }
}
