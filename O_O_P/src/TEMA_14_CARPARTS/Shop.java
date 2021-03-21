package TEMA_14_CARPARTS;

import java.util.ArrayList;

//
class Shop {

    private String name;
    private ArrayList<Part> parts;


    // КОНСТРУКТОР
    public Shop(String name){
        this.name = name;
        parts = new ArrayList<Part>();
    }


    // МЕТОД ЗА ДОБАВЯНЕ НА ЧАСТ В МАГАЗИНА
    public void addPart(Part part)  {parts.add(part); }

    // GETTERS AND SETTERS
    // GETTERS :
    public String getName() { return name; }
    public ArrayList<Part> getParts() { return parts; }

    //SETTERS
    public void setName(String getname) { this.name = getname; }
    public void setParts(ArrayList<Part> setparts) { this.parts = setparts; }


    // /////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        // STRING-BUILDER Е СТРУКТУРА, КОЯТО НИДАВА ВЪЗМОЖНОСТ ДА СВЪЖЕМ В ЕДИН
        // СТРИНГ ИНФОРМАЦИЯТА, КОЯТО СМЕ ПРОЧЕЛИ ОТ РАЗЛИЧНИ ПОЛЕТА НА ОБЕКТА
        StringBuilder result = new StringBuilder();
        result.append("Shop: " + this.name + "\n\n");
        for(Part part : parts) {
            result.append(part);
            result.append("\n");
        }

        return result.toString();

    }

}