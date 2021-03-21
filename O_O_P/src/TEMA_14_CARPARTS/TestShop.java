package TEMA_14_CARPARTS;

class TestShop {

    public static void main(String args[]) {

        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) ПРОИЗВОДИТЕЛИ
        Manufacturer bmw = new Manufacturer("BWM",
                "Germany", "Bavaria", "665544", "876666");

        Manufacturer lada = new Manufacturer("Lada",
                "Russia", "Moscow", "653443", "893321");



        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) АВТОМОБИЛИ
        Car bmw316i = new Car("BMW", "316i", 1994);
        Car ladaSamara = new Car("Lada", "Samara", 1987);
        Car mazdaMX5 = new Car("Mazda", "MX5", 1999);
        Car mercedesC500 = new Car("Mercedes", "C500", 2008);
        Car trabant = new Car("Trabant", "super", 1966);
        Car opelAstra = new Car("Opel", "Astra", 1997);



        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) ЕВТИНА РЕЗЕРВНА ЧАСТ
        Part cheapPart = new Part("Tires 165/50/13", 302.36,
                345.58, lada, "T332", PartCategory.TIRES);

        // ДОБАВЯМЕ ИНФОРМАЦИЯ ЗА КОИ КОЛИ Е ПРИЛОЖИМА
        cheapPart.аddSupportedCar(ladaSamara);
        cheapPart.аddSupportedCar(trabant);



        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) СКЪПА РЕЗЕРВНА ЧАСТ
        Part expensivePart = new Part("BMW Engine Oil",
                633.17, 670.0, bmw, "Oil431", PartCategory.ENGINE);

        // ДОБАВЯМЕ ИНФОРМАЦИЯ ЗА КОИ КОЛИ Е ПРИЛОЖИМА
        expensivePart.аddSupportedCar(bmw316i);
        expensivePart.аddSupportedCar(mazdaMX5);
        expensivePart.аddSupportedCar(mercedesC500);
        expensivePart.аddSupportedCar(opelAstra);



// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //

        // СЪЗДАВАМЕ НОВ МАГАЗИН
        Shop newShop = new Shop(" 'Tunning shop' ");


        // ДОБАВЯМЕ ЧАСТИ В МАГАЗИНА
        newShop.addPart(cheapPart);
        newShop.addPart(expensivePart);


        // РАЗПЕЧЕТВАМЕ ИНФОРМАЦИЯ ЗА МАГАЗИНА
        System.out.println(newShop);

    }

}