package INHERITANCE;

public class Dog extends Animal{

    public Dog(){
        super();
    }

    public Dog(String name, int age){
       super(name, age);
    }


    @Override
    public void talk() {

        System.out.println("bark");
        //super.talk();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}




