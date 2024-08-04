package PropertyManagementSystem;

public class Property {
    private int id;

    private String address;
    private String type;
    private double size;
    private String status;

    // Constructor
    public Property(int id, String address, String type, double size, String status) {
        this.id = id;
        this.address = address;
        this.type = type;
        this.size = size;
        this.status = status;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Property{" +
                "ID=" + id +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", status='" + status + '\'' +
                '}';
    }

    public void updateProperty(String address, String type, double size, String status) {
        this.address = address;
        this.type = type;
        this.size = size;
        this.status = status;
    }
}
