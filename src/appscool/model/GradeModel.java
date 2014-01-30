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
public class GradeModel {
    private String periode;
    private int tab;
    private int noteCC;
    private int noteComp;
    private String appreciation;
    private SubjectModel  subject;
    //Definition des getteurs

    public String getPer(){
        return periode;
    }
    public int getTab(){//type de tab à revoir
    return tab;
    }
    public int getNC(){
        return noteCC;
    }
    public int getNComp(){
        return noteComp;
    }
    public String getApp(){
        return appreciation;
    }
    public SubjectModel getSubject(){
        return subject;
    }

    //Definition des setteurs

    public void setPer(String per){
        this.periode = per;
    }
    public void setTab(int tab){//type de tab à revoir
        this.tab = tab;
    }
    public void setNC(int nCC){
        this.noteCC = nCC;
    }
    public void setNComp(int nComp){
        this.noteComp = nComp;
    }
    public void setApp(String App){
        this.appreciation = App;
    }
    public void setSubject(SubjectModel subj){
        this.subject = subj;
    }
}
