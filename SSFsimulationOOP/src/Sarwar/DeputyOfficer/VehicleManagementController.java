package Sarwar.DeputyOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VehicleManagementController implements Initializable {

    @FXML
    private TableColumn<Vehicle, Integer> vehIDTableColumn;
    @FXML
    private TableColumn<Vehicle, String> vehTypeTableColumn;
    @FXML
    private TableColumn<Vehicle, String> vehPlateTableColumn;
    @FXML
    private TableView<Vehicle> vehInfoTableColumn;
    @FXML
    private TextField vehIDTextField;
    @FXML
    private TextField vehTypeTextField;
    private TextField vehLPTextField;
    @FXML
    private TextField VehLPTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the vehicle table columns
        vehIDTableColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        vehTypeTableColumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());
        vehPlateTableColumn.setCellValueFactory(cellData -> cellData.getValue().plateProperty());

        // Load sample data (you can replace this with your actual data)
        loadData();
    }

    private void loadData() {
        Vehicle vehicle1 = new Vehicle(212, "Car", "DHK METRO G 18-8586");
        Vehicle vehicle2 = new Vehicle(304, "Truck", "DHK METRO H 38-1578");

        vehInfoTableColumn.getItems().addAll(vehicle1, vehicle2);
    }

    @FXML
    private void addVehOnClick(ActionEvent event) {
        try {
            int id = Integer.parseInt(vehIDTextField.getText());
            String type = vehTypeTextField.getText();
            String plate = vehLPTextField.getText();

            Vehicle newVehicle = new Vehicle(id, type, plate);

            vehInfoTableColumn.getItems().add(newVehicle);

            vehIDTextField.clear();
            vehTypeTextField.clear();
            vehLPTextField.clear();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            // Handle the case where the input is not a valid number
        }
    }

    @FXML
    private void remVehOnClick(ActionEvent event) {
        Vehicle selectedVehicle = vehInfoTableColumn.getSelectionModel().getSelectedItem();
        if (selectedVehicle != null) {
            vehInfoTableColumn.getItems().remove(selectedVehicle);
        }
    }

    @FXML
    private void editVehOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/DeputyOfficer/DeputyOfficerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) vehIDTextField.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
