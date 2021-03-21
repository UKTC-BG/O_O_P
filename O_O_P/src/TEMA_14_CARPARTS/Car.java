package TEMA_14_CARPARTS;

class Car {

    private String brand;// марка
    private String model; // модел
    private int productionYear; // година на производство

    // Конструктор с параметри  ТОВА Е ПСЕВДО-МЕТОД
    // Конструктора е метод, ЧИЕТО ИМА СЪВПАДА С ИМЕТО НА КЛАСА !!!
    // ВИДОВЕ КОНСТРУКТОРИ :
    // 1. КОНСТРУКТОР ПО ПОДРАЗБИРАНЕ ИЛИ Т.НАР. DEFAULT-КОНСТРУКТОР

   /*
    ПРАЗЕН КОНСТРУКТОР
    public Car() {
   }

    // DEFAULT-КОНСТРУКТОР
    public Car(){
        this.brand = "МЕРЦЕДЕС";
        this.model = "SLK";
        this.productionYear = 2007;
    }

    */

    // КОНСТРУКТОР С ПАРАМЕТРИ :
    public Car(String brand, String model, int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }


    // GETTERS AND SETTER ///////////////////////////////////

    // GETTERS : --------------------------------------------
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getProductionYear() { return productionYear; }


    // SETTERS : --------------------------------------------
    public void setBrand(String setbrand) { this.brand = setbrand; }
    public void setModel(String setmodel) { this.model = setmodel; }
    public void setProductionYear(int setproductionyear) { this.productionYear = setproductionyear; }




    // /////////////////////////////////////////////////////////
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        // result.append("CARS : " + "\n");
        result.append("Brand: " + this.brand + "\n");
        result.append("Model: " + this.model + "\n");
        result.append("Prod Year: " + this.productionYear + "\n");


        return result.toString();


        //"<" + this.brand +
        // "," + this.model +
        // "," + this.productionYear + ">";
    }

}// End of Class