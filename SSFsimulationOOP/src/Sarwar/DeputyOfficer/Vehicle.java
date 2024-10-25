package Sarwar.DeputyOfficer;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Vehicle {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty type;
    private final SimpleStringProperty plate;

    public Vehicle(int id, String type, String plate) {
        this.id = new SimpleIntegerProperty(id);
        this.type = new SimpleStringProperty(type);
        this.plate = new SimpleStringProperty(plate);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public String getPlate() {
        return plate.get();
    }

    public void setPlate(String plate) {
        this.plate.set(plate);
    }

    public SimpleStringProperty plateProperty() {
        return plate;
    }
}
