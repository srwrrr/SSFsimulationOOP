/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Sarwar.SystemAdministrator;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import ssfsimulationoop.User;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class UserListController implements Initializable {

    @FXML
    private TableView<User> UsersTableView;
    @FXML
    private TableColumn<User, Integer> UserIDTableColumn;
    @FXML
    private TableColumn<User, String> UsernameTableColumn;
    @FXML
    private Button manageUserButton;
    @FXML
    private Button SuspendUserButton;
    @FXML
    private Button UnsuspendUserButton;
    @FXML
    private Button DeleteUserButton;
    @FXML
    private Button ResetUserButton;
    @FXML
    private TableView<User> SusUsersTableView;
    @FXML
    private TableColumn<User, Integer> SusUserIDTableColumn;
    @FXML
    private TableColumn<User, String> SusUsernameTableColumn;
    @FXML
    private Button DashboardButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void ManageUserOnClick(ActionEvent event) {
    }

    @FXML
    private void suspendUserOnClick(ActionEvent event) {
    }

    @FXML
    private void unsuspendUserOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteUserOnClick(ActionEvent event) {
    }

    @FXML
    private void resetPassOnClick(ActionEvent event) {
    }
    
    

    @FXML
    private void ReturnToDashOnClick(ActionEvent event) throws IOException {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("SystemAdministratorDashboard.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Error", "Failed to load the dashboard.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
     
}
    

