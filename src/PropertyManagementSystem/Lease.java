package PropertyManagementSystem;

public class Lease {
    private int id;
    private int propertyId;
    private String tenantName;
    private double rentAmount;
    private String startDate;
    private String endDate;

    // Constructor
    public Lease(int id, int propertyId, String tenantName, double rentAmount, String startDate, String endDate) {
        this.id = id;
        this.propertyId = propertyId;
        this.tenantName = tenantName;
        this.rentAmount = rentAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getPropertyId (){
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getTenantName(){
        return tenantName;
    }

    public void setTenantName (String tenantName) {
        this.tenantName = tenantName;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount (double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate (String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate (String endDate) {
        this.endDate = endDate;
    }

    // Method to update the lease details
    public void updateLease (String tenantName, double rentAmount, String startDate, String endDate) {
        this.tenantName = tenantName;
        this.rentAmount = rentAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + id +
                ", propertyId=" + propertyId +
                ", tenantName='" + tenantName + '\'' +
                ", rentAmount=" + rentAmount +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

}
