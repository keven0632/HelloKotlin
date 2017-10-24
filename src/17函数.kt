/**
 * @author KeVeN
 * @from  PC
 * @date 2017/10/24 17:43
 *
 * 函数是有名字的一段代码块
 * 包含参数和返回值（可选），参数可以有默认值
 *
 */
fun add(x: Int, y: Int): Int {
    return x + y
}

fun main(args: Array<String>) {
//F1函数名可查看文档
    //调用时可打参数名，可读性更好（但调用java函数无效）
    val b = add(3, 2)
    println(b)

    //val c = add(x = 4, y = 5)
    //println(c)

    var num = sum(2, 3, 4, 7)
    println(num)

    val array= intArrayOf(2,3,4,5,6)
    var num2=sum(*array)
    println(num2)
}

//可变参数修饰符vararg
fun sum(vararg x: Int): Int {
    var total = 0
    for (i in x) {
        total += i
    }
    return total


}