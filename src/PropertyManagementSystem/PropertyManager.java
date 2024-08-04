package PropertyManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class PropertyManager {
    private List<Property> properties = new ArrayList<>();
    private List<Lease> leases = new ArrayList<>();
    private Finance finance = new Finance();

    // Methods to manage properties
    public void addProperty(Property property) {
        properties.add(property);
    }

    public void deleteProperty(int propertyId) {
        properties.removeIf(property -> property.getId() == propertyId);
    }

    public void editProperty(int propertyId, String address, String type, double size, String status) {
        for (Property property : properties) {
            if (property.getId() == propertyId) {
                property.updateProperty(address, type, size, status);
                break;
            }
        }
    }

    // Methods to manage leases
    public void addLease(Lease lease) {
        leases.add(lease);
        finance.addRent(lease.getRentAmount());
    }

    public void deleteLease(int leaseId) {
        leases.removeIf(lease -> lease.getId() == leaseId);
    }

    public void editLease(int leaseId, String tenantName, double rentAmount, String startDate, String endDate) {
        for (Lease lease : leases) {
            if (lease.getId() == leaseId) {
                lease.updateLease(tenantName, rentAmount, startDate, endDate);
                break;
            }
        }
    }

    // Methods for finance
    public double getTotalRent() {
        return finance.getTotalIncome();
    }

    public void setPropertyTaxes(double taxes) {
        finance.setPropertyTaxes(taxes);
    }
}

