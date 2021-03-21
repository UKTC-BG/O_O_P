package CAR_LIST;

public class CarClass {

       private  String Marka;
       private  String Model;

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }


    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }


    public CarClass() {
    }


    public CarClass(String marka, String model) {
        Marka = marka;
        Model = model;
    }

}
