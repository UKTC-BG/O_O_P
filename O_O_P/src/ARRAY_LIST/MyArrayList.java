//////////////////////////////////////
// Java program to demonstrate the  //
// working of ArrayList in Java     //
//////////////////////////////////////

package ARRAY_LIST;

//import java.io.*;
import java.util.*;

public class MyArrayList {

    public static void main(String[] args)
    {


// /////////////////////////// СЪЗДАВАНЕ, ДОБАВЯНЕ И ПРЕМАХВАНЕ НА ЕЛЕМЕНТ //////////////////////////////////

/*
        // РАЗМЕР НА ArrayList
        int n = 7;

        // ДЕКЛАРИРА ArrayList С НАЧАЛЕН РАЗМЕР n
        ArrayList<Integer> arrayList_01 = new ArrayList<Integer>(n);

        // ДОБАВЯ НОВ ЕЛЕМЕНТ В КРАЯ НА СПИСЪКА
        for (int i = 1; i <= n; i++)
            arrayList_01.add(i);

        // РЗПЕЧАТВА ЕЛЕМЕНТИТЕ
        System.out.println("arrayList_01 : " + arrayList_01);

        // ПРЕМАХВА ЕЛЕМЕНТ НА ПОЗИЦИЯ 3
        arrayList_01.remove(3);
        //arrayList_01.remove("6");


        // РАЗПЕЧАТВА ArrayList СЛЕД ИЗТРИВАНЕТО
        System.out.println("arrayList_01 : " + arrayList_01);

        // РАЗПЕЧАТВА ЕЛЕМЕНТИТЕ ЕДИН-ПО-ЕДИН
        for (int i = 0; i < arrayList_01.size(); i++)
            System.out.println("arrayList_01 : " + arrayList_01.get(i) + " ");
        System.out.println();

*/




// /////////////////////////// ДОБАВЯНЕ НА ЕЛЕМЕНТ //////////////////////////////////////////////////////////

        // 1. ДОБАВЯНЕ НА ЕЛЕМЕНТ: СТАВА ЧРЕЗ add() method. ТОЗИ МЕТОД Е overloaded
        // ЗА ДА ИЗПЪЛНИ РАЗЛИЧНИ ОПЕРАЦИИ БАЗИРАНИ НА РАЗЛИЧНИ ПАРАМЕТРИ
        // И ТЕ СА:

        //  А/ add(Object): ДОБАВЯ ЕЛЕМЕНТ В КРАЯ НА ArrayList.
        //  Б/ add(int index, Object): ДОБАВЯ ЕЛЕМЕНТ НА СПЕЦИФИЧЕН index В ArrayList.


/*        ArrayList<String> arrayList_02 = new ArrayList<>();

        arrayList_02.add("Geeks1");
        arrayList_02.add("Geeks2");
        System.out.println("arrayList_02 before insert : " + arrayList_02);
        arrayList_02.add(1, "For");

        System.out.println(" after insert arrayList_02 : " + arrayList_02);

        arrayList_02.add("Geeks3");
        arrayList_02.add("Geeks4");

        System.out.println(" afetr add G3 and G4 arrayList_02 : " + arrayList_02);

        System.out.println();

 */




// ///////////////////// ПРОМЯНА НА ЕЛЕМЕНТ /////////////////////////////////////////////////////////////////


        // 2. ПРОМЯНА НА ЕЛЕМЕНТ: СЛЕД ДОБАВЯНЕ, АКО ПОЖЕЛАЕМ ДА ПРОМЕНИМ ДАДЕН ЕЛЕНТ
        // ТОВА СТАВА С МЕТОД set() method. ПОНЕЖЕ ArrayList Е ИНДЕКСИРАН, ЕЛЕМЕНТЪТ,
        // КОЙТО ИСКАМЕ ДА ПРОМЕНИМ Е ДОСТЪПЕН ЧРЕЗ НЕГОВИЯ ИНДЕКС. ЗАТОВА,
        // ТОЗИ МЕТОД ИЗИСКВА ДА МУ ПОДАДЕМ ИНДЕКСА И НОВИЯ ЕЛЕМЕНТ, КОЙТО ДА БЪДЕ
        // ВЪВЕДЕН НА ТОЗИ ИНДЕКС (index).


/*
ArrayList<String> arrayList_03 = new ArrayList<>();

        arrayList_03.add("Geeks1");
        arrayList_03.add("Geeks2");
        System.out.println("arrayList_03 : Initial ArrayList before insert " + arrayList_03);

        arrayList_03.add(1, "Geeks3");
        System.out.println("arrayList_03 : Initial ArrayList after insert " + arrayList_03);

        arrayList_03.set(1, "For");// ПРОМЕНЯМЕ ЕЛЕМЕНТ С ИНДЕКС 1 ОТ 'GEEKS' НА 'FOR'
        System.out.println("arrayList_03 : Updated ArrayList after set new value" + arrayList_03);

 */




// //////////// ПРЕМАХВАНЕ НА ЕЛЕМЕНТ (ПО ИНДЕКС И ПО СЪДЪРЖАНИЕ) ///////////////////////////////////////////
/*

        // 1. ПРЕМАХВАНЕ НА ЕЛЕМЕНТ: СТАВА ЧРЕЗ remove() method. ТОЗИ МЕТОД Е overloaded
        // ЗА ДА ИЗПЪЛНИ РАЗЛИЧНИ ОПЕРАЦИИ БАЗИРАНИ НА РАЗЛИЧНИ ПАРАМЕТРИ
        // И ТЕ СА:

        //  А/ remove(index): ПРЕМАХВА ЕЛЕМЕНТ НА СПЕЦИФИЧЕН index В ArrayList.
        //  Б/ remove(Object): ПРЕМАХВА ЕЛЕМЕНТ ПО СЪДЪРЖАНИЕ (ОБЕКТА).



        // ПРИМЕР И СЪПОСТАВКА МАСИВ И СПИСЪК
        ArrayList<String> arrayList_04 = new ArrayList<>();// ДЕФИНИРАНЕ НА СПИСЪК
        //System.out.println(arrayList_04.get(3)); // ДОСТЪП ДО ЕЛЕМЕНТ В СПИСЪК

        // String[] StringArray = new String[5]; // ДЕФИНИРАНЕ НА МАСИВ
        // System.out.println(StringArray[3]); // ДОСТЪП ДО ЕЛЕМЕНТ В МАСИВ


        arrayList_04.add("Geeks1");
        arrayList_04.add("Geeks2");
        System.out.println("arrayList_04 : Initial ArrayList " + arrayList_04);

        arrayList_04.add(1, "For");
        System.out.println("arrayList_04 : Initial ArrayList after Insert " + arrayList_04);

        arrayList_04.remove(1);
        System.out.println("arrayList_04 : After the Removal by Index " + arrayList_04);

        arrayList_04.remove("Geeks1");
        System.out.println("arrayList_04 : After the Removal by Element(Object) " + arrayList_04);

*/




// //////////// ОБХОЖДАНЕ (ИТЕРАЦИИ) НА СПИСЪК //////////////////////////////////////////////////////////////

        ArrayList<String> arrayList_05 = new ArrayList<>();

        arrayList_05.add("Geeks1");
        arrayList_05.add("Geeks2");
        arrayList_05.add(1, "For");
        arrayList_05.add("Geeks3");
        arrayList_05.add("Geeks4");

        // ЧРЕЗ Get-method И  for-loop ------------------------------------------------------
        for (int i = 0; i < arrayList_05.size(); i++) {

            System.out.println("FOR-LOOP : " + arrayList_05.get(i) + "; ");
        }
        System.out.println();


        // ЧРЕЗ for-each-loop ----------------------------------------------------------------
        for (String str : arrayList_05)
            System.out.println("FOR-EACH-LOOP : " + str + "; ");


    } // END OF MAIN

}// END OF CLASS
