package BUILDINGS_TO_KOTLIN_17212

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val house81 = House(52.32f, "Sofia 81", 2.toShort(), "Johny Depp")
        val house83 = House(56.2f, "Sofia 83", 3.toShort(), "Ariana Grande")
        val house86 = House(60.0f, "Sofia 86", 4.toShort(), "The Rock")

        fancyPrint(house81)
        fancyPrint(house83)
        fancyPrint(house86)
        printMostSpacious()
    }


    // FANCY PRINT ................................................................................
    fun fancyPrint(building: Building?) {
        println("-----------------------------------------------------")
        println(building)
        println("-----------------------------------------------------\n")
    }


    // PRINT MOUST SPECIOUS .......................................................................
    fun printMostSpacious() {
        val mostSpacious = House.mostSpacious()

        println("=====================================================")
        System.out.printf(
                            " The most spacious house is on  : %s; \n" +
                            " The owner of the house is      : %s; \n" +
                            " The floor area is              : %.2f square meters! \n",
                            mostSpacious.address,
                            mostSpacious.ownerName,
                            mostSpacious.area / mostSpacious.numberFloors
        )
        println("=====================================================\n")
    }
}