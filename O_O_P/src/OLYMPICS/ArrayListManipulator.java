package OLYMPICS;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

// @Yavor 16426
public class ArrayListManipulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>(); // Better use HashSet

        System.out.println("*Commands* Add <item>, Remove <item>, Contains <item>, List, Exit");
        while (true) {
            System.out.print("> ");
            String[] tokens = sc.nextLine().split(" ");
            String command = tokens[0].trim().toLowerCase();

            if (command.equals("exit")) {
                break;
            }

            String item = "";
            if (tokens.length == 2) {
                item = tokens[1].trim();
            }

            switch (command) {
                case "add":
                    if (items.contains(item)) {
                        System.out.println(item + " already exists.");
                    } else {
                        items.add(item);
                        System.out.println(item + " added successfully.");
                    }
                    break;

                case "remove":
                    if (!items.contains(item)) {
                        System.out.println(item + " doesn't exist.");
                    } else {
                        items.remove(item);
                        System.out.println(item + " removed successfully.");
                    }
                    break;

                case "contains":
                    if (items.contains(item)) {
                        System.out.println(item + " exists.");
                    } else {
                        System.out.println(item + " doesn't exist.");
                    }
                    break;

                case "list":
                    System.out.println("Your items:\n" + String.join("\n", items));
                    break;

                default:
                    System.out.println("Incorrect input.");
                    break;
            }
        }



        // НЯКОЛКО НАЧИНА ЗА РАЗПЕЧАТВАНЕ НА ARRAY-LIST :
        // ----------------------------------------------
        System.out.println("Final items : " + items);

        // System.out.println("Final items : " + String.join("; ", items));

        // String listString = String.join(", ", items);
        // System.out.println("Final items : " + listString);
    }
}