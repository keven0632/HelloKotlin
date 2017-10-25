/**
 * @author KeVeN
 * @from  PC
 * @date 2017/10/24 15:05
 *
 * 用来检查和运算各种条件和逻辑的组合，控制APP的运行流向
 * 循环：for，while，以及 循环控制
 * if：二元判断
 * when：细致化判断
 */
fun main(args: Array<String>) {
    //for:1、依次操作一个序列（如集合类型）中的每一项，执行次数是可预测的
    val numbers = arrayOf(1, 2, 3, 4)
//    for (i in number) {
//        println(i)
//    }
    //     2、重复执行： for(a in 1....10){//操作}
    for (gg in 1..100) {
        println("重要的事情说100遍，这是第${gg}遍")
    }

    //while:循环执行一系列操作，直到条件不成立，适合执行次数未知的场合
    //Q:1加到多少次才能加到5050
    var number = 1
    var times = 0
    var total = 0
    while (total < 5050) {
        total += number
        number += 1
        times += 1
    }
    println("次数+$times+总共$total")
    //循环中的控制：continue结束本次循环，break结束整个循环
    for (number in numbers) {
        if (number == 2) {
            continue
        }
        println(number)
    }
    for (number in numbers) {
        if (number == 2) {
            break
        }
        println(number)
    }
    //if:条件判断语句，整个语句本身是一个表达式（可用于简单地二元判断计算）
    if (numbers.isEmpty()) {
        println("是空的")
    } else {
        println("数组有内容")
    }
    //when:可对某个变量的大小/范围/值表达式/类型等进行判断
    val num = 3
    when (num) {
        in 0..10 -> {
            println("数字是属于0-10")
        }
        is Int -> {
            println("值是Int类型的")
        }
        1, 3, 5 -> {
            println("属于1,3,5之间")
        }
        else -> {
            println("数字不属于0-10")
        }
    }
}
