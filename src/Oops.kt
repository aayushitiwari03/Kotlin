//class Car(
//    val name:String,
//    val type:String,
//    val companyName:String,
//    val kmRun : Int //properties
//) {
//    fun driveCar(){
//        println("${name} Car is driving") //function is  methods
//    }
//
//    fun applyBrakes(){
//        println("Applied Brakes") //methods is function
//    }
//}
//
//fun main() {
//    val ob1 = Car("mustang", "petrol", "Kia", 100)
//    val ob2 = Car("beetle", "diesel", "Sony", 100)
//
//    println(ob1.name)
//    println(ob1.type)
//    println(ob1.companyName)
//    println(ob1.kmRun)
//
//    println(ob2.name)
//    println(ob2.type)
//    println(ob2.companyName)
//    println(ob2.kmRun)
//
//    ob1.driveCar()
//    ob2.applyBrakes()
//    ob2.driveCar()
//}

//fun main() {
//    val i = 20
//    println(i.plus(30))
//    println(i.toFloat())
//}

//constructor - primary, secondary
//fun main() {
//    val ob1 = Car("mustang", "petrol", "Kia", 100)
//    val ob2 = Person("a",20)
//    println(ob1)
//    println(ob2)
//}
//class Empty()
//
//class Person(name: String, age:Int){
//    val name :String = "name -$name"
//    var age :Int = age
//
//}

//getters, setters

//class Example(name:String, age:Int){
//
//    var name1 = name
//        get() {
//            println("Name getter is called ")
//            return field.toUpperCase()
//        }
//    var age1 = age
//
//        set(value) {
//            if (value>0){
//                field = value
//            }else{
//                println("age can't be negative")
//            }
//        }
//
//    var email :String =""
//        get() = field
//        set(value) {field=value}
//}
//fun main() {
//    val ob1 = Example("Aayuhsi",19)
//    ob1.age1 = -20
//    println(ob1.age1)
//    ob1.age1 = 20
//    println(ob1.age1)
//    println(ob1.name1)
//}

//open class Base(val name: String) {
//
//    init { println("Geeksforgeeks") }
//
//    open val size: Int =
//        name.length.also { println("Geeksforgeeks: $it") }
//}
//
//class Derived(
//    name: String,
//    val lastName: String,
//) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {
//
//    init { println("Geeksforgeeks") }
//
//    override val size: Int =
//        (super.size + lastName.length).also { println("Geeksforgeeks: $it") }
//}

//open class Parent(){
//    init {
//        println("Parent Class")
//    }
//    open var name = "Shri Ram"
//    open var age = 45
//}
//class Child() : Parent(){
//    init {
//        println("Child Class")
//    }
//
//    override var name: String = "Aayushi"
////    override var age: Int = 19
//
//
//}
//fun main() {
//    val ob1 = Child()
//    println(ob1.name)
//    println(ob1.age)
//}

//Polymorphism
//fun main() {
//    val circle : Shape = Circle(4.0)
//    val square :Shape = Square(4.0)
//
//    println( circle.area())
//    println( square.area())
//}
//
//open class Shape (){
//    open fun area():Double{
//        return 0.0
//    }
//}
//
//class Circle(val radius : Double):Shape(){
//    override fun area(): Double {
//        return Math.PI *  radius *radius
//    }
//}
//class Square(val side : Double):Shape(){
//    override fun area(): Double {
//        return side * side
//    }
//}

//abstract

//abstract class Example{
//    abstract var name :String
//    abstract fun example()
//
//    open fun example2(){
//        println("From Abstract Class $name")
//    }
//}
//
//class ExampleAbstract :Example(){
//    override var name: String = "Aayushi"
//
//    override fun example() {
//        println("Abstracted $name")
//    }
//
//    override fun example2() {
//        super.example2()
//        println("From Abstracted $name")
//    }
//}
//
//fun main(){
//    val ob1 = ExampleAbstract()
//
//    ob1.example()
//    ob1.example2()
//}