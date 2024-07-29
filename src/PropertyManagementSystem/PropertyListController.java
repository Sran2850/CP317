package PropertyManagementSystem;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.List;

public class PropertyListController {
    @FXML
    private ListView<String> propertyListView;

    public void setPropertyList(List<Property> propertyList) {
        for (Property property : propertyList) {
            propertyListView.getItems().add(property.toString());
        }
    }
}
