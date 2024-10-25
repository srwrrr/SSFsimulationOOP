package Sarwar.SystemAdministrator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class CreateUserController implements Initializable {

    @FXML
    private TextField UserNameTextArea;
    @FXML
    private TextField UserIDTextArea;
    @FXML
    private TextField UserPassTextArea;
    @FXML
    private TextField UserEmailTextArea;
    @FXML
    private TextField UserConTextArea;
    @FXML
    private DatePicker DOBpicker;
    @FXML
    private DatePicker DOJpicker;
    @FXML
    private ComboBox<String> UserTypeTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> userTypeOptions = FXCollections.observableArrayList(
                "Guest", "Officer", "Service provider", "Higher ups"
        );
        UserTypeTextArea.setItems(userTypeOptions);
    }    

    @FXML
    private void ReturnToDashOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SystemAdministratorDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to load the dashboard.");
        }
    }

    @FXML
    private void createUserButtonOnClick(ActionEvent event) {
        if (areFieldsFilled()) {
            // Implement logic for creating a user (database interaction, validation, etc.)
            showAlert("User Created", "User has been successfully created!");
        } else {
            showAlert("Error", "Please fill in all details.");
        }
    }

    private boolean areFieldsFilled() {
        // Check if all text fields are filled
        return !UserNameTextArea.getText().isEmpty() &&
                !UserIDTextArea.getText().isEmpty() &&
                !UserPassTextArea.getText().isEmpty() &&
                !UserEmailTextArea.getText().isEmpty() &&
                !UserConTextArea.getText().isEmpty() &&
                DOBpicker.getValue() != null &&
                DOJpicker.getValue() != null &&
                UserTypeTextArea.getValue() != null;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
