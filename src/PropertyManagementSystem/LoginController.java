package PropertyManagementSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.util.ArrayList;
import java.util.List;

public class LoginController {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "admin", "password", "admin@example.com", "Admin"));
    }

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        boolean authenticated = users.stream()
                .anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));

        if (authenticated) {
            try {
                Stage stage = (Stage) usernameField.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/PropertyManagementSystem/dashboard.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
