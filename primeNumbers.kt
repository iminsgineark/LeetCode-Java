package Arrays

fun main(args: Array<String>){
    var  low = 2
    val  high = 99999
    print("Prime Numbers are : ")
    while (low < high){
        if (primeNumbers(low)){
            println(low.toString() + " ")
        }
        ++low
    }
}

fun primeNumbers(num : Int) : Boolean{
    var flag = true
    for (i in 2 .. num / 2){
        if (num % i == 0){
            flag = false
            break
        }
    }
    return flag
}