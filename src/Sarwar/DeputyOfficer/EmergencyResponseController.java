/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Sarwar.DeputyOfficer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class EmergencyResponseController implements Initializable {

    @FXML
    private Button ReturnToDashboardButton;
    @FXML
    private Button EvacButton;
    @FXML
    private Button ILButton;
    @FXML
    private Button MAButton;
    @FXML
    private Button RIButton;
    @FXML
    private Button ECButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/DeputyOfficerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ReturnToDashboardButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    @FXML
    private void handleEvac(ActionEvent event) {
        showAlert("Evacuation Action", "Initiate evacuation protocol.");
    }

    @FXML
    private void handleLockdown(ActionEvent event) {
        showAlert("Lockdown Action", "Initiate lockdown protocol.");
    }

    @FXML
    private void handleMedAss(ActionEvent event) {
        showAlert("Medical Assistance Action", "Request medical assistance.");
    }

    @FXML
    private void handleIncident(ActionEvent event) {
        showAlert("Report Incident Action", "Report an incident.");
    }

    @FXML
    private void handleEmergencyContacts(ActionEvent event) {
        showAlert("Emergency Contacts", "Display emergency contact information.");
    }
    
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    
}