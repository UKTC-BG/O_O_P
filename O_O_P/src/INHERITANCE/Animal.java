package INHERITANCE;

public class Animal {

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
    }

    //public Animal(){
    //    this.age = 10;
    //    this.name = "RIK";
    //}

// GETTERS && SETTERS ============================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    ///////////////////////////
    public void talk(){
        System.out.println("talk-talk");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
