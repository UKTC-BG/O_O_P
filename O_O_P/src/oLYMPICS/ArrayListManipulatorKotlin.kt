///////////////////////////
// KOTLIN made from JAVA //
///////////////////////////

package oLYMPICS

import java.util.*
import java.lang.String.*
import kotlin.jvm.JvmStatic

// @Yavor 16426
object ArrayListManipulatorKotlin {

    @JvmStatic
    fun main(args: Array<String>) {

        //val sc = Scanner(System.`in`)
        val sc: Scanner = Scanner(System.`in`)// same as above, but specified explicitly

        val items = ArrayList<String>() // Better use HashSet

        println("*Commands* Add <item>, Remove <item>, Contains <item>, List, Exit")

        while (true) {
            print("> ")
            val tokens = sc.nextLine().split(" ".toRegex()).toTypedArray()
            val command = tokens[0].trim { it <= ' ' }.toLowerCase()
            if (command == "exit") {
                break
            }
            var item = ""

            if (tokens.size == 2) {
                item = tokens[1].trim { it <= ' ' }
            }

            // switch in JAVA
            when (command) {

                "add" -> if (items.contains(item)) {
                    // println("$item already exists.") // as template
                    println(item + " already exists.") // same as above
                } else {
                    items.add(item)
                    // println("$item added successfully.") // as template
                    println(item + " added successfully.") // same as above
                }

                "remove" -> if (!items.contains(item)) {
                    println("$item doesn't exist.")
                } else {
                    items.remove(item)
                    println("$item removed successfully.")
                }

                "contains" -> if (items.contains(item)) {
                    println("$item exists.")
                } else {
                    println("$item doesn't exist.")
                }

                "list" -> {
                    println("""
                    Your items:
                    ${join("\n", items)}
                    """.trimIndent())
                }
                else -> println("Incorrect input.")
            }
        } // end of while

        println("""Final items:${join("\n", items)}""".trimIndent())
    }
}