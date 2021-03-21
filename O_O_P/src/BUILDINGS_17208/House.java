package BUILDINGS_17208;


public class House extends Building {
    private int floors;
    private String owner;
    private double areaByFloor;

    public House(double area, String address, int floors, String owner) {
        super(area, address);
        this.floors = floors;
        this.owner = owner;
        this.areaByFloor = area / floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Площ: " + super.getArea() + ";");
        out.append("Адрес: " + super.getAddress() + ";");
        out.append("Етажи: " + this.getFloors() + ";");
        out.append("Собственик: " + this.getOwner() + ";");

        return out.toString();
    }


    public double getAreaByFloor() {
        return areaByFloor;
    }

    public void setAreaByFloor(double areaByFloor) {
        this.areaByFloor = areaByFloor;
    }


}
