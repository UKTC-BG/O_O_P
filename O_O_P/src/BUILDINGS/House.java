package BUILDINGS;

public class House extends Building{

    private int numberOfFloors; // БРОЙ ЕТАЖИ
    private String owner;       // СОБСТВЕНИК


    // GET-SET
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }


    // CONSTRUCTOR --------------------------------------------------------------
    public House(double area, String address, int numberOfFloors, String owner) {
        super(area, address);
        this.numberOfFloors = numberOfFloors;
        this.owner = owner;
    }





    @Override
    public String toString() {

        StringBuilder forPrint = new StringBuilder();
        {
            forPrint.append("Площ : " + getArea() + " ; ");       //super.getArea());
            forPrint.append("Адрес : " + getAddress() + " ; ");   //super.getAddress());
            forPrint.append("Етажи : " + getNumberOfFloors() + " ; ");
            forPrint.append("Собственик : " + getOwner() + " ; ");
        }

        return forPrint.toString();
    }
}
