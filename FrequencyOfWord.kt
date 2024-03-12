package Arrays

fun main(args: Array<String>){
    print("Enter The String\n")
    val str = readLine().toString()
    val ch = readlnOrNull().toString()
    var freq = 0
    for (i in 0..str.length - 1){
        if (ch == str[i].toString()){
            ++freq
        }
    }
    print("Frequency of String is $ch is $freq")

}