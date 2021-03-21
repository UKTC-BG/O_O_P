package STUDENT_GROUP;

import java.io.FileNotFoundException;
import static STUDENT_GROUP.Students_Methods.*;



public class Students_Main {


    // MAIN =============================================================================
    public static void main(String[] args) throws FileNotFoundException {

        // МЕТОДИ ЗА ЧЕТЕНЕ И АНАЛИЗ НА ДАННИТЕ - НАМИРАТ СЕ В Students_Methods.java
        MakeStatistic( ReadAndSplitFromFile("/home/kriss/Desktop/DATA_TXT.txt") );

    }// END OF MAIN ======================================================================


}


