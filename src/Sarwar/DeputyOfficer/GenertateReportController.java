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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class GenertateReportController implements Initializable {

    @FXML
    private ComboBox<?> reportComboBox;
    @FXML
    private DatePicker reportDatePicker;
    @FXML
    private TextArea reportDetailsTextArea;
    @FXML
    private TableView<?> reportTableColumn;
    @FXML
    private TableColumn<?, ?> reportNoTableColumn;
    @FXML
    private TableColumn<?, ?> reportIDTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addReportOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteReportOnClick(ActionEvent event) {
    }

    @FXML
    private void viewReportOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
    }
    
}
