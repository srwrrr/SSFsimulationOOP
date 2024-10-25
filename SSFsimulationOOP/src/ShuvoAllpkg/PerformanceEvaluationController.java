/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ShuvoAllpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Shuvo
 */
public class PerformanceEvaluationController implements Initializable {

    @FXML
    private ComboBox<?> desgnationfx;
    @FXML
    private ComboBox<?> desgnationfx1;
    @FXML
    private ComboBox<?> desgnationfx11;
    @FXML
    private ComboBox<?> desgnationfx111;
    @FXML
    private ComboBox<?> desgnationfx1111;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ExitButton(MouseEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("/ssfsimulationoop/Loginscene.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void BackButton(MouseEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("HrMannegerDashboard.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }
    
}
