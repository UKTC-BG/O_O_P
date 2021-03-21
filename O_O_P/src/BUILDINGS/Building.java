package BUILDINGS;

public class Building {

    private double area; // ПЛЛОЩ
    private String address; // АДРЕС


    //GET-SET
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


    // CONSTRUCTOR ------------------------------------
    public Building(double area, String address) {
        this.area = area;
        this.address = address;
    }

}
