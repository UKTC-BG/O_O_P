package WORK_WITH_CLASSES;

import java.util.Scanner;

public class Class_Dog //Class of java-file
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // дефинираме скенер з четене на клавиатура

        System.out.print("Write first dog's name: ");
        String firstDogName = input.nextLine(); // четем от клавиатурата
        // Assign dog name with a constructor
        Dog firstDog = new Dog(firstDogName);// дефинираме си 1-ви обект от клас ДОГ

        System.out.print("Write second dog's name: ");
        Dog secondDog = new Dog();// дефинираме си 2-ри обект от клас ДОГ
        // Assign dog name with a property
        secondDog.setName(input.nextLine());


        // Create a dog with a default name
        Dog thirdDog = new Dog();// дефинираме си 3-ти обект от клас ДОГ


        // ДЕФИНИРАМЕ МАСИВ–МАСИВ–МАСИВ ОТ ОБЕКТИ ! ! ! ! !
        Dog[] dogs = new Dog[] { firstDog, secondDog, thirdDog };


        for (Dog dog : dogs)
        {
            dog.bark();
        }

    } // end of main



    // Class DOG declaration ////////////////////////////////////////
    public static class Dog { // Opening brace of the class body

        // Property-field definition
        private String name;

        // Constructor definition DEFAULT
        public Dog() {
            this.name = "JAVARO";
        }

        // Constructor definition WITH PARAMETERS
        public Dog(String name) {
            this.name = name;
        }

        // Property getter-method definition
        public String getName() {
            return this.name;
        }

        // Property setter-method definition
        public void setName(String name) {
            this.name = name;
        }


        // Method definition BARK
        public void bark() {
            System.out.printf("Dog %s said: Wow-wow!%n", name);
        }

    } // Closing brace of the DOG class body


}// end of program class
