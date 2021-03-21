package CAR_LIST;

import java.util.ArrayList;
import java.util.Scanner;


public class CarMain {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        ArrayList<CarClass> CarList = new ArrayList<>();
        String MARKA;
        String MODEL;

        System.out.println("1. ADD");
        System.out.println("2. REMOVE");
        System.out.println("3. PRINT");
        System.out.println("4. EXIT");

        System.out.println("МОЛЯ ИЗБЕРЕТЕ МЕЖДУ 1 и 4 : ");
        int choice = Input.nextInt();

        boolean check = true;

        while(check) {

            switch (choice) {

                case 1:
                    //System.out.println("1");
                    System.out.print("Моля въведете МАРКА : ");
                    MARKA = Input.next();
                    System.out.println();
                    System.out.print("Моля въведете МОДЕЛ : ");
                    MODEL = Input.next();

                    CarList.add(new CarClass(MARKA, MODEL));

                break;


                case 2:
                    //System.out.println("2");
                    System.out.print("Моля въведете МАРКА : ");
                    MARKA = Input.next();
                    System.out.println();
                    System.out.print("Моля въведете МОДЕЛ : ");
                    MODEL = Input.next();

                    //TODO Find Index of car

                    //CarList.remove();

                break;


                case 3:
                    //System.out.println("3");
                    System.out.println(CarList);

                break;


                case 4:
                    System.out.println("4");

                        check = false;

                break;

                default:
                    System.out.println("НЕВАЛИДНА КОМАНДА !");
            }

        }


/*
        CarClass myCar1 = new CarClass("WV", "Passat");
        CarClass myCar2 = new CarClass();

        System.out.println("Input Marka : ");
        myCar2.setMarka(Input.nextLine());
        System.out.println("Input Model : ");
        myCar2.setModel(Input.nextLine());

        CarList.add(myCar1);
        CarList.add(myCar2);

        for (int i = 0; i < CarList.size(); i++) {

            System.out.println("CAR : " + i + " Marka : " + CarList.get(i).getMarka());
            System.out.println("CAR : " + i + " Model : " + CarList.get(i).getModel());
            System.out.println();

        }

*/
    }
}
