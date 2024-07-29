package PropertyManagementSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class MaintenanceRequestController {
    @FXML
    private ListView<String> maintenanceRequestListView;
    @FXML
    private TextField requestTitleField;
    @FXML
    private TextField descriptionField;
    @FXML
    private TextField propertyIdField;

    private List<MaintenanceRequest> maintenanceRequestList;

    public void setMaintenanceRequestList(List<MaintenanceRequest> maintenanceRequestList) {
        this.maintenanceRequestList = maintenanceRequestList;
        if (maintenanceRequestListView != null) {
            for (MaintenanceRequest request : maintenanceRequestList) {
                maintenanceRequestListView.getItems().add(request.toString());
            }
        }
    }

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        String requestTitle = requestTitleField.getText();
        String description = descriptionField.getText();
        int propertyId = Integer.parseInt(propertyIdField.getText());
        String status = "Pending"; // Default status

        int id = maintenanceRequestList.size() + 1; // Generate a new ID
        MaintenanceRequest request = new MaintenanceRequest(id, requestTitle, description, status, propertyId);
        maintenanceRequestList.add(request);
        System.out.println("Maintenance Request Submitted: " + request);
        if (maintenanceRequestListView != null) {
            maintenanceRequestListView.getItems().add(request.toString());
        }
    }
}
