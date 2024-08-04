package PropertyManagementSystem;

public class Finance {
    private double totalRent;
    private double propertyTaxes;
    private double totalIncome;

    // Method to add rent
    public void addRent(double rent) {
        this.totalRent += rent;
        this.totalIncome += rent;
    }

    // Method to set property taxes
    public void setPropertyTaxes(double taxes) {
        this.propertyTaxes = taxes;
    }

    // Method to get total income
    public double getTotalIncome() {
        return this.totalIncome;
    }
}
