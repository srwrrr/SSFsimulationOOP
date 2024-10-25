package ssfsimulationoop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginsceneController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField loginUserIDField;
    @FXML
    private ComboBox<String> loginUserTypeSelectionCombobox;
    @FXML
    private PasswordField loginPasswordField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginUserTypeSelectionCombobox.getItems().addAll("Security Personnel", "Local Law Enforcement", "Commanding Officer", "HR Manager", "Training Instructor", "Director General", "System Administrator", "Deputy Officer");
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
        String username = loginUserIDField.getText();
        String password = loginPasswordField.getText();
        String role = loginUserTypeSelectionCombobox.getValue();

        if ("admin".equals(username) && "admin".equals(password)) {
            Stage stage = (Stage) loginUserIDField.getScene().getWindow();
            Parent root = null;

            try {
                switch (role) {
                    case "System Administrator":
                        root = FXMLLoader.load(getClass().getResource("/Sarwar/SystemAdministrator/SystemAdministratorDashboard.fxml"));
                        break;
                    case "Deputy Officer":
                        root = FXMLLoader.load(getClass().getResource("/Sarwar/DeputyOfficer/DeputyOfficerDashboard.fxml"));
                        break;
                    default:
                        break;
                }
            } catch (IOException e) {
                // Log or handle the exception appropriately
                e.printStackTrace();
                return;  // Exit the method if an exception occurs during loading
            }

            if (root != null) {
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        if ("anny".equals(username) && "anny".equals(password)) {
            Stage stage = (Stage) loginUserIDField.getScene().getWindow();
            Parent root = null;

            try {
                switch (role) {
                    case "Training Instructor":
                        root = FXMLLoader.load(getClass().getResource("/mainpkg/TrainingInstructorDashboard.fxml"));
                        break;
                    case "Director General":
                        root = FXMLLoader.load(getClass().getResource("/mainpkg/DirectorGeneralDashboard.fxml"));
                        break;
                    default:
                        break;
                }
            } catch (IOException e) {
                // Log or handle the exception appropriately
                e.printStackTrace();
                return;  // Exit the method if an exception occurs during loading
            }

            if (root != null) {
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        
        
        if ("Shuvo".equals(username) && "3434".equals(password)) {
            Stage stage = (Stage) loginUserIDField.getScene().getWindow();
            Parent root = null;

            try {
                switch (role) {
                    case "Commanding Officer":
                        root = FXMLLoader.load(getClass().getResource("/ShuvoAllpkg/CommandingOfficerDashboard.fxml"));
                        break;
                    case "HR Manager":
                        root = FXMLLoader.load(getClass().getResource("/ShuvoAllpkg/HrMannegerDashboard.fxml"));
                        break;
                    default:
                        break;
                }
            } catch (IOException e) {
                // Log or handle the exception appropriately
                e.printStackTrace();
                return;  // Exit the method if an exception occurs during loading
            }

            if (root != null) {
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
    }
    
}
