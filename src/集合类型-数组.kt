/**
 * @author KeVeN
 * @date 2017/10/23 13:57
 *
 * 集合类型 Collection
 * 同类型的值的组合，根据整体特性分：
 * 1、有序可重复-Array，索引从0开始（index，i）
 * 2、无序不重复-Set
 * 3、无序可重复-Map，但值有唯一的键（Key）
 */
fun main(args: Array<String>) {
    //Array: Array<类型> 或 arrayof（元素1,元素2,...）
    //大小固定，元素类型不可变
    //地铁11号线："嘉定北","徐家汇","南翔"
    var no11Stations = arrayOf("嘉定北", "徐家汇", "南翔")
    for (no11Station in no11Stations) {
        println("各个车站名称$no11Station")
    }
    //创建一个有默认值的数组,Array(计数，{默认值})
    var no30StationsNameDefault = Array(20, { "30号线默认名称" })
    for (i in no30StationsNameDefault.indices) {
        if (i == 15) {
            println("我是第15个")
        }
    }
    //创建1到10数组：Array(10,{i->i+1})
    //i代表元素的索引值，从0开始
    //i+num,数组将从num开始
    var oneToHundred = Array(100, { i -> i + 1 })
    var oneToNum = Array(10, { i -> i + 2 })
    for (i in oneToNum) {
        println(i)
    }
    //元素计数：count(),空否：isEmpty()
    println("数组1到100是否是空的---${oneToHundred.isEmpty()}")
    //获取其中元素：数组名[索引]，首元素：数组名.first  尾元素： 数组名.last
    println(oneToNum[4])
    println("数组第一个元素：$oneToNum.first()")
    println("数组最后一个元素：$oneToNum.last()")
    //获取前五个元素的快速方法  .component1到5
    println(oneToNum.component1())
    println(oneToNum.component5())

    //获取筛选重复数据后的数组：.distinct()或用.toSet()转换为Set
    val num = arrayOf(1, 2, 3, 4, 5, 6, 1, 2, 3, 1)
    val oneToNum2 = num.distinct()
    for (i in oneToNum2) {
        println("去重后$i")
    }
    val numSet = num.toSet()
    println("numSet的长度${numSet.size}")
    //切割数组：sliceArray
    val smallArray = oneToHundred.sliceArray(1..3)
    for (i in smallArray) {
        println("切割数组：$i")
    }
    //mutableList：Mutablist<类型>或muntabListOf(元素1，元素2...)
    //大小可变，类型不可变

    //在末尾增加元素:add方法。添加另一个数组addAll方法
}