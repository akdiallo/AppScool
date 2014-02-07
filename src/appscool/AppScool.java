/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appscool;




import appscool.model.database.SQLRequestHandler;
import appscool.presenter.admin.employees.AddEmployeeController;
import java.io.File;
import java.nio.file.FileSystems;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author khadre
 */
public class AppScool extends Application{

   // private Stage stage = new Stage();

    private static final String separator = FileSystems.getDefault().getSeparator();
    private static String mainStructure = separator + "appscool";

    @Override
    public void start(Stage primaryStage){
        try {

            SQLRequestHandler sql_rqh = new SQLRequestHandler();
            //File file = new File("");
            //File file_to_read = new File(file.getAbsolutePath() +"\\appscool\\view\\admin\\employees" +"AddEmployeeView.fxml");
            //String folderPath = "/appscool/view/admin/employees/";
            String fileName = "DeleteEmployeeView.fxml";

            String defaultPath = new File("").getAbsolutePath().toString()
        			+ mainStructure;
            String folderPath = defaultPath + separator + "view" + separator + "admin" + separator+
                    "employees" + separator;

           System.out.println("default path : " + folderPath);
            /*System.out.println("file not found");*/
            //URL url = AppScool.class.getResource(defaultPath + separator + "AddEmployeeView.fxml");
            //AnchorPane root =  FXMLLoader.load(Application.class.getResource("/appscool/view/admin/employees/DeleteEmployeeView.fxml"));
            AddEmployeeController page = new AddEmployeeController();
            //AnchorPane page = (AddEmployeeController) replaceSceneContent(AddEmployeeController.getFilePath());
           // primaryStage.setTitle("Add Employee");


            Scene scene = new Scene(page.getRoot());
            primaryStage.setScene(scene);

            primaryStage.show();
        } catch (Exception ex) {
             String defaultPath = new File("").getAbsolutePath().toString()
        			+ mainStructure;

            System.out.println("default path : " + defaultPath);
            Logger.getLogger(AppScool.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    public static void main(String[] args) {
        launch(args);
    }
}
