/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lovely
 */
public class DirectorGeneralDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ListOfSecurityPersonnelButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("ListOfSecurityPersonnel.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void AllocateBudgetButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("AllocateBudget.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void CreateTaskButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("CreateTask.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void EvaluateSecurityPersonnelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ListOfVVIPButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("ListofVVIP.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void SetEmergencyMeetingButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("SetMeeting.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }
    
}
