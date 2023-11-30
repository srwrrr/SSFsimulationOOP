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
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class VehicleManagementController implements Initializable {

    @FXML
    private TableColumn<?, ?> vehIDTableColumn;
    @FXML
    private TableColumn<?, ?> vehTypeTableColumn;
    @FXML
    private TableColumn<?, ?> vehPlateTableColumn;
    @FXML
    private TextField vehDetTextField;
    @FXML
    private TableView<?> vehInfoTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addVehOnClick(ActionEvent event) {
    }

    @FXML
    private void remVehOnClick(ActionEvent event) {
    }

    @FXML
    private void editVehOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
    }

    
}
