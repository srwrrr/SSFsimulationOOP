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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EventManagmentController implements Initializable {

    @FXML
    private TableView<Event> eventTableColumn;
    @FXML
    private TableColumn<Event, Integer> eventIDTableColumn;
    @FXML
    private TableColumn<Event, String> eventNameTableColumn;
    @FXML
    private TableColumn<Event, String> eventDateTableColumn;
    @FXML
    private TextArea eventDetailsTextArea;
    @FXML
    private TextField eventIDTextField;
    @FXML
    private TextField eventNameTextField;
    @FXML
    private DatePicker eventDatePicker;
    @FXML
    private Button ReturnToDashboardButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize your table columns and load data if needed
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
    private void createEventOnClick(ActionEvent event) {
        // Implement logic to create a new event
        // Retrieve data from input fields and add a new event to the table
        int id = Integer.parseInt(eventIDTextField.getText());
        String name = eventNameTextField.getText();
        String date = eventDatePicker.getValue().toString();

        Event newEvent = new Event(id, name, date);
        eventTableColumn.getItems().add(newEvent);

        // Clear input fields
        eventIDTextField.clear();
        eventNameTextField.clear();
        eventDatePicker.getEditor().clear();
    }

    @FXML
    private void deleteEventOnClick(ActionEvent event) {
        // Implement logic to delete the selected event
        Event selectedEvent = eventTableColumn.getSelectionModel().getSelectedItem();
        if (selectedEvent != null) {
            eventTableColumn.getItems().remove(selectedEvent);
        }
    }

    @FXML
    private void editEventOnClick(ActionEvent event) {
        // Implement logic to edit the selected event
        Event selectedEvent = eventTableColumn.getSelectionModel().getSelectedItem();
        if (selectedEvent != null) {
            // You can implement a separate dialog or form for editing the event details
            // and update the selected event in the table
            showAlert("Edit Event", "Editing event: " + selectedEvent.getName());
        } else {
            showAlert("Error", "No event selected for editing.");
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
