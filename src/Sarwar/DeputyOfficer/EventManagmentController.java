/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Sarwar.DeputyOfficer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class EventManagmentController implements Initializable {

    @FXML
    private TableView<?> eventTableColumn;
    @FXML
    private TableColumn<?, ?> eventIDTableColumn;
    @FXML
    private TableColumn<?, ?> eventNameTableColumn;
    @FXML
    private TableColumn<?, ?> eventDateTableColumn;
    @FXML
    private TextArea eventDetailsTextArea;
    @FXML
    private TextField eventIDTextField;
    @FXML
    private TextField eventNameTextField;
    @FXML
    private DatePicker eventDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
    }

    @FXML
    private void createEventOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteEventOnClick(ActionEvent event) {
    }

    @FXML
    private void editEventOnClick(ActionEvent event) {
    }
    
}
