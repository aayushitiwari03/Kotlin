//two sums - easy

//class Solution {
//    var array = IntArray(size = 2)
//    var ifBreak = false
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//            for (i in 0..nums.size-1) {
//                    for (j in 0..nums.size - 1) {
//                        if (nums[i] + nums[j] == target && i!=j) {
//                            array.set(0, i)
//                            array.set(1, j)
//                            ifBreak = true
//                            break
//                        }
//                    }
//                if (ifBreak==true){
//                    break
//                }
//            }
//        println(array.get(0))
//        println(array.get(1))
//        return array
//    }
//}
//fun main(){
//    val ob1 = Solution()
//    print("Enter Size of an Array : ")
//    val size = readLine()!!.toInt()
//    var nums = IntArray(size)
//    for (i in 0..nums.size-1){
//        println("Enter Array Elements ")
//        val inpu = readLine()!!.toInt()
//        nums[i] = inpu
//    }
//    print("Enter Target Value : ")
//    val target = readLine()!!.toInt()
//    ob1.twoSum(nums, target)
//}

//Palindrome Number - (a number which is same if we reverse it for example
// 121 - 121,  111-111 1001 - 1001 212 - 212

//class Solution {
//    fun isPalindrome(x: Int) : Boolean{
//        val converter = x.toString() //121 123 - 321
//        var index = converter.length -1
//
//        var string = ""
//
//        while (index >= 0 ){
//            println(converter[index])
//            string += converter[index]
//            index--
//        }
//
//        return if (string == x.toString()) {
//            println("Yes $string is equal to $x")
//            true
//        } else {
//            println("No $string is not equal to $x")
//            false
//        }
//    }
//}
//
//fun main(){
//    val ob1 = Solution()
//    print("Enter a Number : ")
//    val number = readln().toInt()
//    ob1.isPalindrome(number)
//}

//Roman to Integer

/*

I      -      1
V      -      5
X      -      10
L      -      50
C      -      100
D      -      500
M      -      1000

*/

//class Solution {
//    fun romanToInt(s: String): Int {
//        val array = arrayOf('I','V','X','L','C','D','M')
//        val number = 1
//
//
//
//    }
//}
//
//fun main() {
//
//    val ob1 = Solution()
//    print("Enter Roman Number : ")
//    val roman = readln()
//    ob1.romanToInt(roman)
//
//}