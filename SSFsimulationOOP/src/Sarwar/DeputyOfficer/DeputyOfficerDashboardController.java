package Sarwar.DeputyOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DeputyOfficerDashboardController implements Initializable {

    @FXML
    private Button EqpButton;
    @FXML
    private Button RepButton;
    @FXML
    private Button RTCButton;
    @FXML
    private Button EmergencyButton;
    @FXML
    private Button EventButton;
    @FXML
    private Button CommButton;
    @FXML
    private Button VehicleButton;
    @FXML
    private Button GeoButton;
    @FXML
    private Button LogoutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization logic, if needed
    }

    @FXML
    private void ViewEqpOnClick(ActionEvent event) {
        try {
            // Load the Equipments FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/Equipments.fxml"));
            Parent root = loader.load();

            // Set the Equipments scene as the root of the Stage
            Stage stage = (Stage) EqpButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewReportOnClick(ActionEvent event) {
        try {
            // Load the GenerateReports FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/GenertateReport.fxml"));
            Parent root = loader.load();

            // Set the GenerateReports scene as the root of the Stage
            Stage stage = (Stage) RepButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewRealTimeOnClick(ActionEvent event) {
        try {
            // Load the RealTimeComm FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/RealTimeComm.fxml"));
            Parent root = loader.load();

            // Set the RealTimeComm scene as the root of the Stage
            Stage stage = (Stage) RTCButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewProtocolOnClick(ActionEvent event) {
        try {
            // Load the EmergencyResponse FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/EmergencyResponse.fxml"));
            Parent root = loader.load();

            // Set the EmergencyResponse scene as the root of the Stage
            Stage stage = (Stage) EmergencyButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewEventOnClick(ActionEvent event) {
        try {
            // Load the EventManagement FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/EventManagment.fxml"));
            Parent root = loader.load();

            // Set the EventManagement scene as the root of the Stage
            Stage stage = (Stage) EventButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewCommunityOnClick(ActionEvent event) {
        try {
            // Load the CommunityManagement FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/CommunityManagement.fxml"));
            Parent root = loader.load();

            // Set the CommunityManagement scene as the root of the Stage
            Stage stage = (Stage) CommButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewVehicleOnClick(ActionEvent event) {
        try {
            // Load the VehicleManagement FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/VehicleManagement.fxml"));
            Parent root = loader.load();

            // Set the VehicleManagement scene as the root of the Stage
            Stage stage = (Stage) VehicleButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void ViewLocationOnClick(ActionEvent event) {
        try {
            // Load the GeolocationTracking FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/GeolocationTracking.fxml"));
            Parent root = loader.load();

            // Set the GeolocationTracking scene as the root of the Stage
            Stage stage = (Stage) GeoButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    @FXML
    private void LogoutFromDashboardOnClick(ActionEvent event) {
        // Load the login scene FXML file
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ssfsimulationoop/Loginscene.fxml"));
            Parent root = loader.load();

            // Set the login scene as the root of the Stage
            Stage stage = (Stage) LogoutButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    // Helper method to show an alert
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
