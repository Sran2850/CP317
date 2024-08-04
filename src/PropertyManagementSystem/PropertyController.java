package PropertyManagementSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.List;

public class PropertyController {

    @FXML
    private TextField locationField;
    @FXML
    private TextField typeField;
    @FXML
    private TextField sizeField;
    @FXML
    private TextField statusField;

    private List<Property> propertyList;

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @FXML
    private void handleSaveButtonAction(ActionEvent event) {
        String address = locationField.getText();
        String type = typeField.getText();
        double size = Double.parseDouble(sizeField.getText());
        String status = statusField.getText();

        int id = propertyList.size() + 1; // Generate a new ID
        Property property = new Property(id,  address, type, size, status);
        propertyList.add(property);
        System.out.println("Property Saved: " + property);
    }
}
