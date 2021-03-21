package STUDENT_GROUP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Students_Methods
{


    //<editor-fold desc="ReadAndSplitFromFile">

    // METHOD : READ AND SPLIT ===========================================================
    public static Students[] ReadAndSplitFromFile(String DATA) throws FileNotFoundException {

        int counter = 0; // БРОИМ РЕДОВЕТЕ ВЪВ ФАЙЛА

        //ЧЕТЕМ ОТ ФАЙЛА
        Scanner myReader = new Scanner(new File(DATA), "UTF-8");// Read from file

        // ПРЕБРОЯВАМЕ ЗАПИСИТЕ (РЕДОВЕТЕ) ВЪВ ФАЙЛА
        while (myReader.hasNextLine()) { counter++; }

        // СЪЗДАВАМЕ МАСИВ ОТ ОБЕКТИ - КЛАСА ЗА ТЯХ Е В Students.java
        Students[] StudentGroup = new Students[counter];
        counter = 0;


        // FOR цикъл за попълване на масива с учениците
        while (myReader.hasNextLine()) {

            System.out.println("NOW READING FROM FILE FOR EVERY STUDENT [" + counter + "] : ");

            // ЧЕТЕМ ЕДИН ПО ЕДИН РЕДОВЕТЕ
            String dataString = myReader.nextLine();

            // сплитваме по "," (запетая) и ги слагаме в масив
            String[] splitedData  = dataString.split(",");

            StudentGroup[counter].setNumber(Integer.parseInt(splitedData[0]));    // get from col Number of DATA.TXT
            StudentGroup[counter].setName(splitedData[1]);      //get from col Name of DATA.TXT
            StudentGroup[counter].setFamily(splitedData[2]);    //get from col Family of DATA.TXT
            StudentGroup[counter].setAvgscore(Double.parseDouble(splitedData[3]));  //grt from col Avgscore of DATA.TXT

            counter++;
        }

        System.out.println("FINISHING READ FROM FILE !!!");

        return StudentGroup;
    }// end of read and split ---------------------------------------

    //</editor-fold>



    //<editor-fold desc="MakeStatistic">

    // METHOD : MAKE STATISTIC ==========================================================

    public static void MakeStatistic(Students[] StudentGroup) {

        double GroupAvgScore = 0;

        // print group.................................................
        for (Students thisStudent : StudentGroup) // FOR-EACH
        {
            System.out.print("Номер : " + thisStudent.getNumber());
            System.out.print(" Име : " + thisStudent.getName());
            System.out.print(" Фамилия : " + thisStudent.getFamily());
            System.out.println(" Ср.Успех : " + thisStudent.getAvgscore());
        }

        // print average score...........................................
        for (Students thisStudent : StudentGroup) // FOR-EACH
        {
            GroupAvgScore = GroupAvgScore + thisStudent.getAvgscore();
            GroupAvgScore = GroupAvgScore / StudentGroup.length;
            System.out.println("AVG SCORE : " + GroupAvgScore);
        }

        // MAX score ....................................................
        int index =0;
        double MaxScore = 0;

        for (Students thisStudent : StudentGroup) // FOR-EACH
        {
            if (MaxScore < thisStudent.getAvgscore()) {
                MaxScore = thisStudent.getAvgscore();
                index++;
            }
        }
        System.out.println("MAX SCORE : " + MaxScore);
        System.out.print("Номер : " + StudentGroup[index].getNumber());
        System.out.print(" Име : " + StudentGroup[index].getName());
        System.out.print(" Фамилия : " + StudentGroup[index].getFamily());
        System.out.println(" Ср.Успех : " + StudentGroup[index].getAvgscore());


        // MIN score .......................................................
        index =0;
        double MinScore = 0;

        for (Students thisStudent : StudentGroup) // FOR-EACH
        {
            if ( MinScore < thisStudent.getAvgscore() ) {
                MinScore = thisStudent.getAvgscore();
                index++;
            }
            System.out.println("MIN SCORE : " + MinScore);
            System.out.print("Номер : " + StudentGroup[index].getNumber());
            System.out.print(" Име : " + StudentGroup[index].getName());
            System.out.print(" Фамилия : " + StudentGroup[index].getFamily());
            System.out.println(" Ср.Успех : " + StudentGroup[index].getAvgscore());

        }

    } // end of Make Statistic --------------------------------------

    //</editor-fold>

}
