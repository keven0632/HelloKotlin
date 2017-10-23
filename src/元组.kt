/**
 * @author KeVeN
 * @date 2017/10/23 9:59
 * 元组(Tuple)，给多个变量同时赋值，分二元（Pair）和三元(Triple)
 */
fun main(args: Array<String>) {
    var (day, method, course) = Triple(3, "学会", "Kotlin")
    print("${day}天$method$course ")

    var (一周, 一月) = Pair("七天", "三十天")
    print("\n一周有$一周，一个月有${一月}")

    val  费用=Pair("费用",0)
    print("\n您的${费用.first}总计为${费用.second}元")
}