package INHERITANCE;

public class Cat extends Animal{

    public Cat(){
        super();
    }

    public Cat(String name, int age){
       super(name, age);
    }

    @Override
    public void talk() {
        System.out.println("meau");
        //super.talk();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
