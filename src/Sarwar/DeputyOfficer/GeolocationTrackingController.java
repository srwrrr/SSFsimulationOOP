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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author sarwa
 */
public class GeolocationTrackingController implements Initializable {

    @FXML
    private WebView mapWebView;
    @FXML
    private TableView<?> trackerTableColumn;
    @FXML
    private TableColumn<?, ?> vehicleTrackTableColumn;
    @FXML
    private TableColumn<?, ?> eqpTrackTableColumn;
    @FXML
    private TableColumn<?, ?> persTrackTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void startTrackingOnClick(ActionEvent event) {
    }

    @FXML
    private void stopTrackingOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
    }
    
}
