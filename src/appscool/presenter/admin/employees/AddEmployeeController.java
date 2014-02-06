/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool.presenter.admin.employees;

import appscool.AppScool;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author khadre
 */
public class AddEmployeeController extends AnchorPane implements Initializable  {

    private Parent root ;

    public Parent getRoot() {
        return root;
    }

    public AddEmployeeController() throws IOException {

        root = FXMLLoader.load(AppScool.class.getResource(getFilePath()));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       /* try {
            // TODO
            final Result  load = FXMLLoader.load(AppScool.class.getResource(getFilePath()));
            System.out.println(AppScool.class.toString());
        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    /*
     * Returns the path of the FXML file
     *
     */
    public static String getFilePath() {

        final String folderPath = "/appscool/view/admin/employees/";
        //File file = new File("");
        //System.out.println("file : " + file.getAbsolutePath());
        //final String folderPath = (file.getAbsolutePath() + "\\src\\appscool\\view\\admin\\employees\\" );
        final String filename = "AddEmployeeView.fxml";
        return folderPath + filename;
    }
}
