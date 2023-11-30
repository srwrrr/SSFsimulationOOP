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
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class EquipmentsController implements Initializable {

    @FXML
    private TableView<?> eqpTableColumn;
    @FXML
    private TableColumn<?, ?> eqpIDTableColumn;
    @FXML
    private TableColumn<?, ?> eqpNameTableColumn;
    @FXML
    private TableColumn<?, ?> eqpMainTableColumn;
    @FXML
    private TextField eqpIDTextField;
    @FXML
    private TextField eqpNameTextField;
    @FXML
    private DatePicker eqpMainDatePicker;

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
    private void addEqpOnClick(ActionEvent event) {
    }

    @FXML
    private void removeEqpOnClick(ActionEvent event) {
    }

    @FXML
    private void performMainOnClick(ActionEvent event) {
    }
    
}

