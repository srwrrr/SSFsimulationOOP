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
public class TrainingInstructorDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ListOfTraineeButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("ListOfTrainees.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void ScheduleTrainingSessionsButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("ScheduleTrainingSessions.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void MonitorPerformanceButtonOnClick(ActionEvent event)throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("MonitorPerformance.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void RecordAttendanceButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("RecordAttendance.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void SelectTraineesforSecurityTeamButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("SelectTrainees.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void RequestforTrainingEquipmentsButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource("RequestForEquipments.fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }

    @FXML
    private void GeneratePdfButtonOnClick(ActionEvent event) throws IOException {
        Parent prnt = FXMLLoader.load(getClass().getResource(".fxml"));
         Scene scn = new Scene(prnt);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
         window.setScene(scn);
         window.show();
        
    }
    
}
