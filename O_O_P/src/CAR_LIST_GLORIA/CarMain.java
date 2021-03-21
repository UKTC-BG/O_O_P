package CAR_LIST_GLORIA;

import java.util.ArrayList;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<CarClass> cars = new ArrayList<CarClass>();

        boolean check = true;

        while (check) {
            System.out.println("Menu:");
            System.out.println("1.add car");
            System.out.println("2.remove car");
            System.out.println("3.print");
            System.out.println("4.Exit");
            int numb = Integer.parseInt(scan.nextLine());

            switch(numb)
            {
                case 1:
                    System.out.println("Enter cars name");
                    String name = scan.nextLine();
                    System.out.println("Enter cars mark");
                    String mark = scan.nextLine();
                    cars.add(new CarClass(name, mark));
                    break;

                case 2:
                    System.out.println("Enter cars index");
                    int index = Integer.parseInt(scan.nextLine());
                    cars.remove(index);
                    break;

                case 3:
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.println(cars.get(i).getMark());
                    }
                    break;
                case 4:
                    check = false;
                    break;

                default:
                    System.out.println("Invalid command");
                    break;


            }

        }
    }




}
