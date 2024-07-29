package PropertyManagementSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class DashboardController {

    private List<Property> propertyList = new ArrayList<>();
    private List<MaintenanceRequest> maintenanceRequestList = new ArrayList<>();

    public DashboardController() {
        // Sample data for demonstration purposes
        propertyList.add(new Property(1, "Location 1", "Type 1", 100.0, "Available"));
        propertyList.add(new Property(2,  "Location 2", "Type 2", 150.0, "Occupied"));

        maintenanceRequestList.add(new MaintenanceRequest(1, "Fix Leak", "Fix the leaking pipe in the kitchen", "Pending", 1));
        maintenanceRequestList.add(new MaintenanceRequest(2, "Replace Window", "Replace the broken window in the living room", "Completed", 2));
    }

    @FXML
    private void handleViewProperties(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("property_list.fxml"));
            Scene scene = new Scene(loader.load());

            PropertyListController controller = loader.getController();
            controller.setPropertyList(propertyList);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleAddProperty(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("property_form.fxml"));
            Scene scene = new Scene(loader.load());

            PropertyController controller = loader.getController();
            controller.setPropertyList(propertyList);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleViewMaintenanceRequests(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("maintenance_request_list.fxml"));
            Scene scene = new Scene(loader.load());

            MaintenanceRequestController controller = loader.getController();
            controller.setMaintenanceRequestList(maintenanceRequestList);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleAddMaintenanceRequest(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("maintenance_request_form.fxml"));
            Scene scene = new Scene(loader.load());

            MaintenanceRequestController controller = loader.getController();
            controller.setMaintenanceRequestList(maintenanceRequestList);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadView(String fxmlFile) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
