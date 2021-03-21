package BUILDINGS_17208;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<House> houses = new ArrayList<>();


        System.out.println("Въведете данни за къща.");
        String input = sc.nextLine();

        while (!input.equals("край")) {
            String[] tokens = input.split("\\s+");

            double area = Double.parseDouble(tokens[0]);
            int floors = Integer.parseInt(tokens[2]);

            House house = new House(area, tokens[1], floors, tokens[3]);
            houses.add(house);
            System.out.println("Въведете данни за къща.");
            input=sc.nextLine();
        }


        houses.stream().forEach(e -> System.out.println(e));
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.println("Най-просторната къща:");
        findBiggestHouse(houses);
    }

    public static void findBiggestHouse(List<House> houses){

        List<House> end= houses.stream()
                .sorted(Comparator.comparingDouble(House::getAreaByFloor)
                        .reversed())
                .collect(Collectors.toList());
        System.out.println(end.get(0));


    }
}
