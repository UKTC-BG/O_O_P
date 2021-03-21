package BUILDINGS;


public class Program {

    public static void main(String[] args) {

        Building house1 = new House(28.5, "Правец, 121", 3, "Петър" );
        Building house2 = new House(38.5, "Ловеч, 171", 3, "Йонко" );
        Building house3 = new House(48.5, "София, 69", 3, "Димитър" );


        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);

    }


}
