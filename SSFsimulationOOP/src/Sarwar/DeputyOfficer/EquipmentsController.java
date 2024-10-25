package Sarwar.DeputyOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EquipmentsController implements Initializable {

    @FXML
    private TableView<Equipment> eqpTableColumn;
    @FXML
    private TableColumn<Equipment, Integer> eqpIDTableColumn;
    @FXML
    private TableColumn<Equipment, String> eqpNameTableColumn;
    @FXML
    private TableColumn<Equipment, String> eqpMainTableColumn;
    @FXML
    private TextField eqpIDTextField;
    @FXML
    private TextField eqpNameTextField;
    @FXML
    private DatePicker eqpMainDatePicker;
    @FXML
    private Button ReturnToDashboardButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eqpIDTableColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        eqpNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        eqpMainTableColumn.setCellValueFactory(cellData -> cellData.getValue().mainProperty());

        loadData();
    }

    private void loadData() {
        Equipment equipment1 = new Equipment(46, "Training Armors", "2023-12-23");
        Equipment equipment2 = new Equipment(69, "Guns and Magazines", "2021-10-22");

        eqpTableColumn.getItems().addAll(equipment1, equipment2);
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
    private void addEqpOnClick(ActionEvent event) {
        try {
            // Get data from input fields
            int id = Integer.parseInt(eqpIDTextField.getText());
            String name = eqpNameTextField.getText();
            String main = eqpMainDatePicker.getValue().toString();

            Equipment newEquipment = new Equipment(id, name, main);

            eqpTableColumn.getItems().add(newEquipment);

            eqpIDTextField.clear();
            eqpNameTextField.clear();
            eqpMainDatePicker.getEditor().clear();
        } catch (NumberFormatException e) {
            showAlert("Error", "Please enter a valid ID (integer).");
        }
    }

    @FXML
    private void removeEqpOnClick(ActionEvent event) {
        Equipment selectedEquipment = eqpTableColumn.getSelectionModel().getSelectedItem();
        if (selectedEquipment != null) {
            eqpTableColumn.getItems().remove(selectedEquipment);
        }
    }

    @FXML
    private void performMainOnClick(ActionEvent event) {
        showAlert("Maintenance Ordered!", "Maintenance has been ordered for the equipment.");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
