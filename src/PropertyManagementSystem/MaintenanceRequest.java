package PropertyManagementSystem;

public class MaintenanceRequest {
    private int id;
    private String title;
    private String description;
    private String status;
    private int propertyId;

    // Constructor
    public MaintenanceRequest(int id, String title, String description, String status, int propertyId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.propertyId = propertyId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public String toString() {
        return "MaintenanceRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", propertyId=" + propertyId +
                '}';
    }
}
