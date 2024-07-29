module PropertyManagementSystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens PropertyManagementSystem to javafx.fxml;
    exports PropertyManagementSystem;
}





