/*fun main() {
    sum()
    sub()
}

fun sum(){
    var num1 = 5
    var num2 = 6
    println("Sum = "+(num1+num2))
}
fun sub(){
    var num1 = 10
    var num2 = 8
    println("Sub = "+(num1-num2))
}
*/


var count = 0
fun rec(){
    count++;
    if(count<=5){
        println("hello "+count)
        rec()
    }
}
fun main() {
    rec()
}