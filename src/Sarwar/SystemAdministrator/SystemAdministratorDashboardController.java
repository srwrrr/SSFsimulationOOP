package Sarwar.SystemAdministrator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;

public class SystemAdministratorDashboardController implements Initializable {

    @FXML
    private Button BackButton;
    @FXML
    private Button UsersListButton;
    @FXML
    private Button ManageButton;
    @FXML
    private Button CreateUserButton;
    @FXML
    private Button NotButton;

    @FXML
    private Button LogoutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
private void ViewDatabaseOnClick(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/SystemAdministrator/BackupDatabase.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) BackButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace(); 
    }
}


    @FXML
private void ViewUsersOnClick(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/SystemAdministrator/UserList.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) UsersListButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace(); 
    }
}


    @FXML
private void ViewCreateOnClick(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/SystemAdministrator/CreateUser.fxml"));
        Parent root = loader.load();
       Stage stage = (Stage) ManageButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace(); 
    }
}


    @FXML
private void ViewNotificationOnClick(ActionEvent event) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Sarwar/SystemAdministrator/BroadcastNotification.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) NotButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    @FXML
    private void LogoutFromDashboardOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ssfsimulationoop/Loginscene.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) LogoutButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
