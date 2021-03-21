package INHERITANCE;

//import WORK_WITH_CLASSES.Class_Dog.Dog;

public class Start {

    public static void main(String[] args) {

        System.out.println("НАСЛЕДЯВАНЕ : ");

        Dog myDog = new Dog("DOG",10);

        Cat myCat = new Cat("RIK",3);


        System.out.println(myDog);
        System.out.println(myCat);



        myDog.talk();
        myCat.talk();


    }

}
