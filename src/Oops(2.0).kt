//Interface

//interface Drag{
//    fun drag()
//}
//
//class Player(val name:String) : Drag{
//    override fun drag() {
//        println("$name is dragging")
//    }
//
//}
//fun dragObject(objects: Array<Drag>){
//    for (obj in objects){
//        obj.drag()
//    }
//}
//abstract class Shape() : Drag{
//    abstract fun area():Double
//}
//
//class Circle(val radius : Double):Shape(){
//    override fun area(): Double {
//        return Math.PI * radius * radius
//    }
//
//    override fun drag() {
//        //to do
//    }
//
//}
//class Square(val side : Double):Shape(){
//    override fun area(): Double {
//        return side * side
//    }
//
//    override fun drag() {
//        //to do
//    }
//
//}
//class Triangle(val base : Double, val height : Double):Shape(){
//    override fun area(): Double {
//        return 0.5 * base * height
//    }
//
//    override fun drag() {
//        //to do
//    }
//
//}
//
//fun main() {
//   dragObject(arrayOf(Circle(4.0), Square(4.0), Triangle(2.0, 3.0), Player("Smile")))
//}

//object declaration and expression

//object A {
//    val number:Int = 10
//    fun you(){
//        println(number)
//    }
//
//}
//object B {
//    val number:Int = 10
//    fun you(){
//        println(number)
//    }
//
//}

//fun main() {
////    println(A.you())
////    println(B.you())
//}

//singleton

//object SingletOS{
//
//}

//fun main() {
//    var obj = object  : Cloneable{
//        override fun clone() {
//
//        }
//
//    }
//}
//
//interface Cloneable{
//    fun clone()
//}
//companion object

//fun main() {
//    My.f()
//}
//
//
//class My{
//    companion object MyObject{
//        fun f(){
//            println("Hello")
//        }
//    }
//}

//enum

//fun main() {
//    val Days = Days.Monday
////    println(Days.num)
//    Days.priint()
//}
//
//enum class Days(val num:Int){
//    Sunday(1),
//    Monday(2),
//    Tuesday(3),
//    Wednesday(4),
//    Thursday(5),
//    Friday(6),
//    Saturday(7);
//
//    fun priint(){
//        println("Days $this")
//    }
//}

//sealed class Type
//
//class Red(val type: String, val points:Int) : Type()
//class Blue(val points:Int) : Type()
//
//fun main() {
//    val type = Red("Mushroom", 25)
//    val type2 = Blue(20)
//
//    println(type)
//    println(type2)
//}

//Null Safety

//fun main() {
//    var n = "Non-Nullable"
//    var s : String? = null
//    var isAdult : Boolean? = null
//    var number : Int? = null
//
//    if (s != null) {
//        println( s.toUpperCase())
//    }
//
//    println( s?.toUpperCase())
//
//    s?.let {
//        println("Line 1")
//        println("Line 2 $s")
//        println("Line 3 $it")
//    }
//
//    var selcted = s ?: "NA"
//
//    var value = s!!.toUpperCase()
//
//}

//Exception Handling - try,Catch, finally, throw

//fun main() {
//    var array = arrayOf(1,2,3)
//    try { //esa code jisme error aa sakti hain
//        println( array[5])
//    }catch (ex : NullPointerException){
//
//    }
//    catch (e : Exception){
//        println("This won't work")
//    }finally { //hamesha excute hoga
//        println("I will execute no matter what!!")
//    }
//}



