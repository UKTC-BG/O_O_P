package TEMA_14_CARPARTS;

import java.util.ArrayList;
//import java.util.HashSet;



class Part {

    private String name;
    private String code;
    private PartCategory category;
    private ArrayList<Car> supportedCars;// ПО ВАША ПРЕЦЕНКА МОЖЕ И HashSet<> !!!
    //private HashSet<Car> supportedCars;// ПО ВАША ПРЕЦЕНКА МОЖЕ И ArrayList<> !!!
    private double buyPrice;
    private double sellPrice;
    private Manufacturer manufacturer;


// КОНСТРУКТОР
    public Part(String name,
                double buyPrice,
                double sellPrice,
                Manufacturer manufacturer,
                String code,
                PartCategory category){

        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.manufacturer = manufacturer;
        this.code = code;
        this.category = category;
        this.supportedCars = new ArrayList<Car>();
    }



    // МЕТОД ЗА ДОБАВЯНЕ НА ПОДДЪРЖАНИ КОЛИ ЗА СЪОТВЕТНАТА ЧАС
    public void аddSupportedCar(Car car) {
        this.supportedCars.add(car);
    }



    // /////////////////////////////////////////////////////////

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        result.append("Part: " + this.name + "\n");
        result.append("-code: " + this.code + "\n");
        result.append("-category: " + this.category + "\n");
        result.append("-buyPrice: " + this.buyPrice + "\n");
        result.append("-sellPrice: " + this.sellPrice + "\n");
        result.append("-manufacturer: " + this.manufacturer +"\n");
        result.append("---Supported cars---" + "\n");

        for (Car car:this.supportedCars) {
            result.append(car);
            result.append("\n");
        }

        result.append("----------------------\n");

        return result.toString();

    }

}