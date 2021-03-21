package CAR_LIST_GLORIA;

public class CarClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public CarClass() {
        this.name = "Set car's name";
        this.mark = "Set car's mark";

    }
    public CarClass(String name ,String mark){
        this.name=name;
        this.mark=mark;
    }


}
