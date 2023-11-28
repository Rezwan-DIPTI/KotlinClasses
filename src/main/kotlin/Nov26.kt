/*

fun main() {
    val a = 30
    val b = 20

    var operator = readLine()

        var result = when (operator){
        "+" -> {
        a + b
    }
        "-" -> {
        a - b
    }
        "/" -> {
        a / b
    }
        "*" -> {
        a * b
    }
     else -> {
         "$operator is not valid"
            }
    }
    println("Result = $result")
}

*/

/*

fun main(args: Array<String>) {

    var num1:Float = 1.20f
    var num2:Float = 2.45f

    println("--Before swap--")
    println("First number = $num1")
    println("Second number = $num2")

    // Value of num1 is assigned to tempNum
    val tempNum = num1

    // Value of num2 is assigned to num1
    num1 = num2

    // Value of tempNum (which contains the initial value of num1) is assigned to num2
    num2 = tempNum

    println("\n --After swap--")
    println("First number = $num1")
    println("Second number = $num2")
}

*/

/*
fun main(args: Array<String>) {

    val num = 5
    var i = 1
    var factorial:Long = 1
    while (i <= num) {
        factorial *= i.toLong()
        i++
    }
    println("Factorial of $num = $factorial")
}
 */

/*
fun main() {
    var n = 5
    var fact = 1
    for (i in 1 ..n){
        fact*=i//fact = fact*1
    }
    println("Factorial is: $fact")
}
*/

/*
fun main(args: Array<String>) {
        val n = 10
        var term1 = 0
        var term2 = 1

        print("First $n terms: ")

        for (i in 1..n) {
            print("$term1 ")

            val sum = term1 + term2
            term1 = term2
            term2 = sum
        }

}
 */

/*
fun main() {
    var n = 10
    var a = 0
    var b = 1

    for (i in 1 .. n){
        print("$a ")
        var next = a+b
        a = b
        b = next
    }

}

*/

fun main(args: Array<String>) {
    println("Hello World!")
}