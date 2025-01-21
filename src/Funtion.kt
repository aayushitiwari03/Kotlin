
//fun main(){
//    //val sum = sum(2, 3)
//    println(sum(false))
//}
//
//fun sum (a:Boolean):Boolean{
//    return a
//}

//default argument

//fun main(){
//    println(mul(a =5, i = 3, i1 = 4))
//}
//
//fun mul(a : Int = 2, i: Int, i1: Int): Int {
//        return a*i*i1
//}

//named argument

//fun main() {
//    val name = "Rahul"
//    val age = 23
//    val born = 2001
//    val job = "Android Developer"
//    detail(name, age, born, job)
//}
//
//fun detail(s: String = "Suraj", i: Int = 27, i1: Int = 1997, s1: String = "Software Engineer") {
//    println("Name is $s")
//    println("Age is $i")
//    println("Born in $i1")
//    println("Job is $s1")
//}

//recursive function

//num = 5 means 5*4*3*2*1

//fun main(){
//
//    recursive()
//
//}
//
//fun recursive(){
//    print("Enter number of which you want a Factorial of : ")
//    val num = readln().toInt() //5
//    var number = num
//    var sumOfFactorialNumber = 1
//
//    while (number > 0){
//        sumOfFactorialNumber *= number //5*1 = 5
//        number -= 1 //4
//    }
//
//    println("Entered Number $num Factorial is $sumOfFactorialNumber")
//}

//fun main() {
//    print("Enter number to find the Factorial of it : ")
//    val num = readLine()!!.toInt()
//    println("Factorial of $num is : " + fact(num))
//}
//
//fun fact(num:Int):Long{
//    return if (num==1) num.toLong() else num*fact(num-1)
//}

//lambda function

//fun main() {
//    val sum = { a : Int, b : Int -> a + b}
//    val sum1 : (Int, Int) -> Int = {a , b -> a + b }
//    println(sum(2,4))
//    println(sum1(12,14))
//}

//val numbers = arrayOf(1,-2,3,-4,5)
//
//fun main() {
//    println(numbers.filter {  it > 0 })
//}

//inline

//fun higherfunc( str : String, mycall :(String)-> Unit) {
//
//    // inovkes the print() by passing the string str
//    mycall(str)
//}
//
//// main function
//fun main(args: Array<String>) {
//    print("GeeksforGeeks: ")
//    higherfunc("A Computer Science portal for Geeks",::print)
//}
