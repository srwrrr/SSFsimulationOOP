/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssfsimulationoop;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author sarwa
 */
public class User {
    private final SimpleIntegerProperty userID;
    private final SimpleStringProperty username;

    public User(int userID, String username) {
        this.userID = new SimpleIntegerProperty(userID);
        this.username = new SimpleStringProperty(username);
    }

    public int getUserID() {
        return userID.get();
    }

    public String getUsername() {
        return username.get();
    }
}
