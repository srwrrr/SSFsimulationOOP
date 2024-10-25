package Sarwar.DeputyOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CommunityManagementController implements Initializable {

    @FXML
    private Button ReturnToDashboardButton;
    @FXML
    private TableView<Community> CommTableView;
    @FXML
    private TableColumn<Community, Integer> CommIDTableColumn;
    @FXML
    private TableColumn<Community, String> CommNameTableColumn;
    @FXML
    private TextArea CommDetTextArea;
    @FXML
    private TextField CommIDTextField;
    @FXML
    private TextField CommNameTextField;
    @FXML
    private Button CreateCommButton;
    @FXML
    private Button EditCommButton;
    @FXML
    private Button DeleteCommButton;

    private ObservableList<Community> communityList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize the community table columns
        CommIDTableColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        CommNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        loadData();
        CommTableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                CommDetTextArea.setText("Details for Community " + newValue.getId() + ":\n" + newValue.getDetails());
            } else {
                CommDetTextArea.clear();
            }
        });
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
    private void createCommOnClick(ActionEvent event) {
        int id = Integer.parseInt(CommIDTextField.getText());
        String name = CommNameTextField.getText();
        String details = "This Community is still being processed for details"; 

        Community newCommunity = new Community(id, name, details);
     CommTableView.getItems().add(newCommunity);
        communityList.add(newCommunity);
      CommIDTextField.clear();
        CommNameTextField.clear();
        CommDetTextArea.clear();
    }

    @FXML
    private void editCommOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteCommOnClick(ActionEvent event) {
        Community selectedCommunity = CommTableView.getSelectionModel().getSelectedItem();
        if (selectedCommunity != null) {
            CommTableView.getItems().remove(selectedCommunity);
            communityList.remove(selectedCommunity);
            CommDetTextArea.clear(); 
        }
    }

    private void loadData() {
        Community community1 = new Community(23, "DOHS Area", "Generals have requested for more personnel for better security");
        Community community2 = new Community(34, "Cantonment Area", "SSF vehicles that will go through cantonment shall be given special access");

        CommTableView.getItems().addAll(community1, community2);
        communityList.addAll(community1, community2);
    }
}
