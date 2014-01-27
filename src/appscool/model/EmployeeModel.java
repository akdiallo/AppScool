/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.model;

/**
 *
 * @author khadre
 */
public class EmployeeModel extends PersonModel{

    private String nationalIdentificationNumber;
    private String position; // poste

    public String getNationalIdentificationNumber() {
        return nationalIdentificationNumber;
    }

    public void setNationalIdentificationNumber(String nationalIdentificationNumber) {
        this.nationalIdentificationNumber = nationalIdentificationNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
