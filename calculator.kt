package Arrays

import java.util.*
import kotlin.system.exitProcess

fun main(args : Array<String>){
    val input = Scanner(System.`in`)
    print("Enter first number")
    val first = readLine()?.toDouble()
    print("Enter second number")
    val second = readLine()?.toDouble()
    print("Enter The Operator from (+, -, *, /, %)")
    val operator = readLine()
    val result = when(operator){
        "+" -> second?.let { first?.plus(it) }
        "-" -> if (first!! > second!!){
            first - second
        } else {
            second - first
        }

        "*" -> second?.let { first?.times(it) }
        "/" -> second?.let { first?.div(it) }
        "%" -> second?.let { first?.mod(it) }
        else -> {
            println("Invalid Proccess")
            exitProcess(1)
        }
    }
    println(result)
}