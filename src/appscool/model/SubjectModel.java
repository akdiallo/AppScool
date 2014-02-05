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
public class SubjectModel {
     private String intitule;
     private int coefficient;
     private List <StudentModel> StudentList;
     private List  <TeacherModel> TeacherList;


     //getter=accesseur
     public int getCoef(){
         return coefficient;
     }
     public List getStudentList(){
         return StudentList;
     }
     public List getTeacherList(){
         return TeacherList;
     }
     

     //setter=modificateur
     public void setCoef(int val){
         this.coefficient=val;
     }


}
