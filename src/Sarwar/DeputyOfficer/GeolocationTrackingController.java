package Sarwar.DeputyOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyStringWrapper;

public class GeolocationTrackingController implements Initializable {

    @FXML
    private TableView<String> trackerTableColumn;
    @FXML
    private TableColumn<String, String> vehicleTrackTableColumn;
    @FXML
    private TableColumn<String, String> eqpTrackTableColumn;
    @FXML
    private TableColumn<String, String> persTrackTableColumn;

    @FXML
    private Button ReturnToDashboardButton; // Add this line

    // Other methods...

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the tracker table columns
        vehicleTrackTableColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue()));
        eqpTrackTableColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue()));
        persTrackTableColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue()));

        // Load sample data
        loadData();
    }

    @FXML
    private void startTrackingOnClick(ActionEvent event) {
        showAlert("Tracking Started", "Tracking has been started!");
    }

    @FXML
    private void stopTrackingOnClick(ActionEvent event) {
        showAlert("Tracking Stopped", "Tracking has been stopped!");
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

    private void loadData() {
        trackerTableColumn.getItems().add("306");
        trackerTableColumn.getItems().add("415");
        trackerTableColumn.getItems().add("687");
        trackerTableColumn.getItems().add("898");

        trackerTableColumn.getItems().add("21");
        trackerTableColumn.getItems().add("76");
        trackerTableColumn.getItems().add("89");
        trackerTableColumn.getItems().add("78");

        trackerTableColumn.getItems().add("SSF generals");
        trackerTableColumn.getItems().add("Agents on missions");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
