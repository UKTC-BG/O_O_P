package BUILDINGS_TO_KOTLIN_17212


import java.lang.StringBuilder
import java.util.ArrayList

// КАСЪТ СЕГА Е PUBLIC И FINAL;
// АКО ДОБАВИТЕ МОДИФИКАТОРА OPEN, ЩЕ СТАНЕ PUBLIC И OPEN;
     class House(
                    area: Float, address: String?,
                    var numberFloors: Short, var ownerName: String
                    ) : Building(area, address!!) {


    // CONSTRUCTOR.................................................................................
    init {
        houseList.add(this)
    }


    // TO-STRING (OVERRIDE)........................................................................
    override fun toString(): String {
        val toPrint = StringBuilder()
        run {
            toPrint.append( "Address    : ${this.address} \n")
            toPrint.append( "Owner      : ${this.ownerName} \n" )
            toPrint.append( "Floors     : ${this.numberFloors} \n" )
            toPrint.append( "Total area : ${this.area}" )
            }
        return toPrint.toString()
    }


    companion object {

        var houseList = ArrayList<House>()


        // MOST SUSPICIOUS.........................................................................
        fun mostSpacious(): House {
            var max = houseList[0]

            for (getHouse in houseList) {
                if (getHouse.area / getHouse.numberFloors > max.area / max.numberFloors) {
                    max = getHouse
                }
            }
            return max
        }
    }



}
