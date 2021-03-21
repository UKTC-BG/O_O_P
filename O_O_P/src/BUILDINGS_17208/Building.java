package BUILDINGS_17208;

public class Building {
    private double area;
    private String address;

    public Building(double area, String address) {
        this.area = area;
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
